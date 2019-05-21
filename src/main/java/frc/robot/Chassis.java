package frc.robot;

import frc.parent.*;

public class Chassis implements RobotMap{

    public static CCTalon fLeft = new CCTalon(RobotMap.FORWARD_LEFT, RobotMap.FL_REVERSE);
    public static CCTalon fRight = new CCTalon(RobotMap.FORWARD_RIGHT, RobotMap.FR_REVERSE);
    public static CCTalon bLeft = new CCTalon(RobotMap.BACK_LEFT, RobotMap.BL_REVERSE);
    public static CCTalon bRight = new CCTalon(RobotMap.BACK_RIGHT, RobotMap.BR_REVERSE);

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
}