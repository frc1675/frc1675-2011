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
public class Elbow extends Subsystem {
    private SpeedController victor2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Elbow(){
        victor2 = new Victor(RobotMap.DSC_SLOT, RobotMap.CLAW_ELBOW_MOTOR);
    }
    
    public void setMotor(double change){
        victor2.set(change);
    }
    
    public void goUp(){
        victor2.set(1.0);
    }
    
    public void goDown(){
        victor2.set(-1.0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
