package frc.robot;

import frc.parent.*;

//Extends the Mechanisms class
//It does use two talons so using tTwo won't cause an error(probably)
public class Intake extends Mechanisms{

    public Intake(int portOne, int portTwo){
        super(portOne, true, portTwo, true);
    }

    public void set(double speed){
        tOne.set(speed);
        tTwo.set(speed);
    }

}
