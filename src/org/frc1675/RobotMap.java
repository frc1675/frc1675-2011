package org.frc1675;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //Motor Channels
    public static final int DRIVE_MOTOR_1 = 1;
    public static final int DRIVE_MOTOR_2 = 2;
    public static final int DRIVE_MOTOR_3 = 3;
    public static final int DRIVE_MOTOR_4 = 4;
    public static final int CLAW_ELBOW_MOTOR = 5;
    public static final int CLAW_TOP_ROLLER = 7;
    public static final int CLAW_BOTTOM_ROLLER = 8;
    public static final int LIFT_MOTOR = 6;
    
    //Encoder Channels
    public static final int LIFT_ENC_A = 1;
    public static final int LIFT_ENC_B = 2;
    
    //Limit Switch
    public static final int LIFT_MAX_SWITCH = 3;
    public static final int LIFT_MIN_SWITCH = 4;
    
    public static final int DSC_SLOT = 1;
    
    public static final int DRIVER_CONTROLLER = 1;
}
