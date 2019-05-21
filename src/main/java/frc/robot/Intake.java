package frc.robot;

import frc.parent.*;
public class Intake extends Mechanisms{

    public Intake(int portOne, int portTwo){
        super(portOne, true, portTwo, false);
    }

    public void set(double speed){
        tOne.set(speed);
        tTwo.set(speed);
    }

}
