package frc.parent;

/*
    RobotMap holds all the ports involved in the robot.
    This ranges from talon ports, all the way to the ports
    on the controllers. This also contains the polarity for the wheels
    and the various ports assoiated with sensors

    If you wish to create your own port, here is the syntax:
        public static final returnType name = value;
    Notes on creating ports:
        1. Ports must be integers or booleans
        2. they MUST be public static final;
        3. If the port is not plugged in, make int values -1, and boolean values false


*/
public interface RobotMap {

    // Wheel Talons
    public static final int FORWARD_LEFT = 5;
    public static final int FORWARD_RIGHT = 2;
    public static final int BACK_LEFT = 1;
    public static final int BACK_RIGHT = 8;
}