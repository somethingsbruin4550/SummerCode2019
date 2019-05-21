package frc.robot;

import frc.parent.*;

public class Climber extends Mechanisms{

    public Climber(int portOne, boolean rOne){
        super(portOne, rOne, -1, false);
    } 

    public void set(double speed){
        tOne.set(speed);
    }
    
}