
package org.frc1675;

import com.sun.squawk.util.MathUtils;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.frc1675.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    // Constants
    private static final int LEFT_X_AXIS = 1;
    private static final int LEFT_Y_AXIS = 2;
    private static final int TRIGGER_AXIS = 3;
    private static final int RIGHT_X_AXIS = 4;
    private static final int RIGHT_Y_AXIS = 5;
    private static final int DPAD_AXIS = 6;
    
    private static final int A_BUTTON = 1;
    private static final int B_BUTTON = 2;
    private static final int X_BUTTON = 3;
    private static final int Y_BUTTON = 4;
    
    private static final int LEFT_BUMPER_BUTTON = 5;
    private static final int RIGHT_BUMPER_BUTTON = 6;
    
    private static final int LEFT_JOYSTICK_BUTTON = 9;
    private static final int RIGHT_JOYSTICK_BUTTON = 10;
    private static final double DEADZONE_RADIUS = 0.15;
    
    
    
    //Controls
    private Joystick driverController = new Joystick(RobotMap.DRIVER_CONTROLLER);
    private Button yButton = new JoystickButton(driverController, Y_BUTTON);
    private Button aButton = new JoystickButton(driverController, A_BUTTON);
    private Button xButton = new JoystickButton(driverController, X_BUTTON);
    private Button bButton = new JoystickButton(driverController, B_BUTTON);
    private Button lBumper = new JoystickButton(driverController, LEFT_BUMPER_BUTTON);
    private Button rBumper = new JoystickButton(driverController, RIGHT_BUMPER_BUTTON);
    
    
    public OI(){
        yButton.whileHeld(new LiftUp());
        aButton.whileHeld(new LiftDown());
        xButton.whileHeld(new ElbowUp());
        bButton.whileHeld(new ElbowDown());
        lBumper.whileHeld(new RollerClawSpit());
        rBumper.whileHeld(new RollerClawInhale());
    }
    
    public double getMecanumMagnitude(){
        double x = driverController.getRawAxis(LEFT_X_AXIS);
        double y = driverController.getRawAxis(LEFT_Y_AXIS);
        double magnitude = Math.sqrt(MathUtils.pow(x,2.0) + MathUtils.pow(y,2.0));
        
        if(magnitude < DEADZONE_RADIUS){
            magnitude = 0;
        }
        
        
        return magnitude;
    }
    
    public double getMecanumRotation(){
        double x = driverController.getRawAxis(RIGHT_X_AXIS);
        double rotation = x;
        if(Math.abs(rotation) < DEADZONE_RADIUS){
            rotation = 0;
        }
        
        return rotation;
    }
    
    public double getMecanumDirection(){
        double direction;
        double x = driverController.getRawAxis(LEFT_X_AXIS);
        double y = driverController.getRawAxis(LEFT_Y_AXIS);
        //y *= -1.0; <-- Created a flip problem
        double magnitude = getMecanumMagnitude();
        
        if(magnitude < DEADZONE_RADIUS){
            direction = 0.0;
        }
        else{
            direction = MathUtils.atan2(y, x);
        }
        direction -= Math.PI/2;
        
        
        return direction;
    }
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand())
}

