package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    private static Joystick contOne = new Joystick(0);

    public static void button(int button){
        contOne.getRawButton(button);
    }

    public static void axis(int axis){
        contOne.getRawAxis(axis);
    }

    public static double normalize(double value, double min, double max){
        if(value > max)
            return max;
        else if (value < min)
            return min;
        else
            return value;
    }


}