package frc.parent;

import frc.robot.*;

public abstract class Mechanisms{

    protected CCTalon tOne;
    protected CCTalon tTwo;

    public Mechanisms(int portOne, boolean rOne , int portTwo, boolean rTwo){
        tOne = new CCTalon(portOne, rOne);
        tTwo = new CCTalon(portTwo, rTwo);
    }

    public abstract void set(double speed);

    public double getSpeed(){
        return tOne.getSpeed();
    }
}