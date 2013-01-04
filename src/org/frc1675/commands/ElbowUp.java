/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.frc1675.commands;

/**
 *
 * @author ericmiller
 */
public class ElbowUp extends CommandBase {
    
    public ElbowUp() {
        requires(elbow);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        elbow.setMotor(1.0);
        System.out.println("Elbow up!!!");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        elbow.setMotor(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        elbow.setMotor(0.0);
    }
}
