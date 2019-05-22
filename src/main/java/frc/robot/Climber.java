package frc.robot;

import frc.parent.*;

//Extends the Mechanisms class
//Nothing to special
//Note: it only uses one talon, so using tTwo in anyway is cause an error
public class Climber extends Mechanisms{

    public Climber(int portOne, boolean rOne){
        super(portOne, rOne, -1, false);
    } 

    public void set(double speed){
        tOne.set(speed);
    }
    
}