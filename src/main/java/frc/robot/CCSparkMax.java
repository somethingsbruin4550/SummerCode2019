package frc.robot;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

//Documention: http://www.revrobotics.com/content/sw/max/sw-docs/java/com/revrobotics/CANSparkMax.html#%3Cinit%3E(int,com.revrobotics.CANSparkMaxLowLevel.MotorType)

public class CCSparkMax extends CANSparkMax{

    /**
     * CCSparkMax allows us to easily control Spark Max motor controllers
     * Information on modes can be found in the Spark Max documentation
     * @param deviceID The CAN channel of the motor controller
     * @param controlMode Specify whether the motor controller is operating in Brushed or Brushless mode
     * @param idleMode Specify whether the motor controller is set to Coast or Brake mode
     * @param reverse Reverses the direction of the motor controller
     */
    public CCSparkMax(int deviceID, MotorType controlMode, IdleMode idleMode, boolean reverse){
        super(deviceID, controlMode);
        super.setIdleMode(idleMode);
        super.setInverted(reverse);
    }

    public void set(double speed){
        super.set(speed);
    }
}