package frc.parent;

import frc.robot.*;

//This is the general parent class for all the mechanisms of the robot
//If you are building a new mechanism, please dont rewrite old code
public abstract class Mechanisms{

    //Creates talon objects
    //Protected is eaiser to use then making getter and setter methods
    protected CCTalon tOne;
    protected CCTalon tTwo;

    //Builds the two talon objects
    //If a mechaism only has one motor controller, do this:
    //  super(portOne, reverse, -1, false)
    public Mechanisms(int portOne, boolean rOne , int portTwo, boolean rTwo){
        tOne = new CCTalon(portOne, rOne);
        tTwo = new CCTalon(portTwo, rTwo);
    }

    //Sets the motors to a percent output [-100%, 100%]
    //If you only use one talon, ONLY SET ONE TALON
    public abstract void set(double speed);
}