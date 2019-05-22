package frc.robot;

import edu.wpi.first.wpilibj.Talon;

/*  
    CCTalon allows us to control the motor controllers
    ALL motor controllers are controlled through CCTalon
    Its like Talon, but better
*/
public class CCTalon extends Talon{

    //This controls the polarity of the motor controller
    //This is the main addition of CCTalon versus Talon
    private boolean reverse;

    //Constructs the talon object
    public CCTalon(int port, boolean reverse){
        super(port);
        this.reverse = reverse;
    }

    //Sets the motor controller to a PercentOutput based on speed and polarity
    public void set(double speed){
        if(reverse)
            super.set(-speed);
        else
            super.set(speed);    
    }

}

