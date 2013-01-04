/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.frc1675.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc1675.RobotMap;

/**
 *
 * @author ericmiller
 */
public class RollerClaw extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private SpeedController topRoller;
    private SpeedController bottomRoller;
    
    public RollerClaw(){
        topRoller = new Victor(RobotMap.DSC_SLOT, RobotMap.CLAW_TOP_ROLLER);
        bottomRoller = new Victor(RobotMap.DSC_SLOT, RobotMap.CLAW_BOTTOM_ROLLER);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void spit(){
        topRoller.set(-1.0);
        bottomRoller.set(-1.0);
    }
    
    public void inhale(){
        topRoller.set(1.0);
        bottomRoller.set(1.0);
    }
    
    public void rotateUp(){
        topRoller.set(-1.0);
        bottomRoller.set(1.0);
    }
    
    public void rotateDown(){
        topRoller.set(1.0);
        bottomRoller.set(-1.0);
    }
    
    public void stop(){
        topRoller.set(0.0);
        bottomRoller.set(0.0);
    }
}
