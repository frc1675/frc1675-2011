/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.frc1675.commands;

/**
 *
 * @author ericmiller
 */
public class DriveWithJoysticks extends CommandBase {
    
    public DriveWithJoysticks() {
        requires(mecanumDrive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        mecanumDrive.drive(oi.getMecanumMagnitude(), oi.getMecanumDirection(), oi.getMecanumRotation());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
