package frc.robot;

import edu.wpi.first.wpilibj.Talon;

public class CCTalon extends Talon{

    private boolean reverse;

    public CCTalon(int port, boolean reverse){
        super(port);
        this.reverse = reverse;
    }

    public void set(double speed){
        if(reverse)
            super.set(-speed);
        else
            super.set(speed);    
    }

}

