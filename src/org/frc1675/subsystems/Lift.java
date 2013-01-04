/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.frc1675.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc1675.RobotMap;

/**
 *
 * @author ericmiller
 */
public class Lift extends Subsystem {
    private SpeedController victor1;
    private DigitalInput limit1;
    //private DigitalInput limit2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public Lift(){
        victor1 = new Victor(RobotMap.DSC_SLOT, RobotMap.LIFT_MOTOR);
        limit1 = new DigitalInput(RobotMap.DSC_SLOT, RobotMap.LIFT_MAX_SWITCH);
        //limit2 = new DigitalInput(RobotMap.DSC_SLOT, RobotMap.LIFT_MIN_SWITCH);
    }

    public void setMotor(double change) {
        victor1.set(change);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void goUp(){
        if(limit1.get() == true){
            victor1.set(1.0);
        }
        else{
            victor1.set(0.0);
        }
        
        
    }
    
    public void goDown(){
        victor1.set(-0.2);
        
    }

    protected void initDefaultCommand() {
        
    }
}
