package frc.robot;

import frc.parent.*;
import edu.wpi.first.wpilibj.Encoder;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Timer;

public class Chassis implements RobotMap{

    //Talon objects for the wheels
    public static CCTalon fLeft = new CCTalon(RobotMap.FORWARD_LEFT, RobotMap.FL_REVERSE);
    public static CCTalon fRight = new CCTalon(RobotMap.FORWARD_RIGHT, RobotMap.FR_REVERSE);
    public static CCTalon bLeft = new CCTalon(RobotMap.BACK_LEFT, RobotMap.BL_REVERSE);
    public static CCTalon bRight = new CCTalon(RobotMap.BACK_RIGHT, RobotMap.BR_REVERSE);

    //Talon objects for the Sensors 
    public static Encoder eLeft = new Encoder(RobotMap.ENCODER_A_LEFT, RobotMap.ENCODER_B_LEFT);
    public static Encoder eRight = new Encoder(RobotMap.ENCODER_A_RIGHT, RobotMap.ENCODER_B_RIGHT);
    public static AHRS gyro = new AHRS(SPI.Port.kMXP);


    public static void tankDrive(double yAxis, double xAxis){
        fLeft.set(OI.normalize((yAxis + xAxis), -1.0, 1.0));
        fRight.set(OI.normalize((yAxis - xAxis), -1.0, 1.0));
        bLeft.set(OI.normalize((yAxis + xAxis), -1.0, 1.0));
        bRight.set(OI.normalize((yAxis - xAxis), -1.0, 1.0));
    }

    public static void driveSpd(double lSpeed, double rSpeed){
        fLeft.set(OI.normalize(lSpeed, -1.0, 1.0));
        fRight.set(OI.normalize(rSpeed, -1.0, 1.0));
        bLeft.set(OI.normalize(lSpeed, -1.0, 1.0));
        bRight.set(OI.normalize(rSpeed, -1.0, 1.0));
    }

    public static void reset(){
        eLeft.reset();
        eRight.reset();
        gyro.reset();
    }

    public static double getDist(){
        return (eLeft.getDistance() + eRight.getDistance())/2;
    }

    /*
        "Whosever holds these PiDs, if he be worthy, shall posses the power of AJ"
    */

    public static void driveDist(double goal, double kp, double max, boolean debug){
        double pos = getDist();
        double error = goal-pos;
        double aError = goal*0.05;
        double input = 0;

        while(true){
            pos = getDist();
            error = goal-pos;
            input = error*kp;
            input = OI.normalize(input, -max, max);

            driveSpd(input, input);

            if(debug){
                System.out.println("Input: " + input);
                System.out.println("Error: " + error);
                System.out.println("Position: " + pos);
                Timer.delay(0.05);
            }

            if(error <= aError){
                driveSpd(0.0, 0.0);
                System.out.println("YOINK, ya made it");
                break;
            }
        }
    }

    public static void turnToAngle(double goal, double kp, double max, boolean debug){
        double angl = gyro.getAngle();
        double error = goal-angl;
        double aError = goal*0.05;
        double input = 0;

        while(true){
            angl = getDist();
            error = goal-angl;
            input = error*kp;
            input = OI.normalize(input, -max, max);

            driveSpd(-input, input);

            if(debug){
                System.out.println("Input: " + input);
                System.out.println("Error: " + error);
                System.out.println("Angle: " + angl);
                Timer.delay(0.05);
            }

            if(error <= aError){
                driveSpd(0.0, 0.0);
                System.out.println("YOINK, ya made it");
                break;
            }
        }
    }

    
}