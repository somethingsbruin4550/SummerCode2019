package frc.parent;

public interface RobotMap {

    // Wheel Talons
    public static final int FORWARD_LEFT = 5;
    public static final int FORWARD_RIGHT = 2;
    public static final int BACK_LEFT = 1;
    public static final int BACK_RIGHT = 8;

    // Wheel Talon Polarity
    public static final boolean FL_REVERSE = false;
    public static final boolean FR_REVERSE = true;
    public static final boolean BL_REVERSE = false;
    public static final boolean BR_REVERSE = true;

    // Wheel Encoder Ports
    public static final int ENCODER_A_LEFT = 0;// 0
    public static final int ENCODER_B_LEFT = 1; // 1
    public static final int ENCODER_A_RIGHT = 2; // 2
    public static final int ENCODER_B_RIGHT = 3; // 3
       

    // Joystick Axises
    public static final int L_JOYSTICK_HORIZONTAL = 0;
    public static final int L_JOYSTICK_VERTICAL = 1;
    public static final int L2 = 2;
    public static final int R2 = 3;
    public static final int R_JOYSTICK_HORIZONTAL = 4;
    public static final int R_JOYSTICK_VERTICAL = 5;

    // Controller Buttons
    public static final int X_BUTTON = 1;
    public static final int O_BUTTON = 2;
    public static final int SQUARE_BUTTON = 3;
    public static final int TRIANGLE_BUTTON = 4;
    public static final int L1_BUTTON = 5;
    public static final int R1_BUTTON = 6;
    public static final int SELECT_BUTTON = 7;
    public static final int START_BUTTON = 8;
    // These buttons are when you push down the left and right circle pad
    public static final int L_JOYSTICK_BUTTON = 9;
    public static final int R_JOYSTICK_BUTTON = 10;

    // Controller Zeroes
    public static final double LEFT_Y_ZERO = -0.0078125;
    public static final double RIGHT_Y_ZERO = -0.0078125;

    // Talon Ports for Intake
    public static final int INTAKE_A = 3;
    public static final int INTAKE_B = 4;

    // Talon ports for Climber
    public static final int CLIMBER = 6;

    // Talon ports for Elevator
    public static final int ELEVATOR = 7;

}