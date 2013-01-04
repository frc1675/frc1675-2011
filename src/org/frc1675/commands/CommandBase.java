package org.frc1675.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.frc1675.OI;
import org.frc1675.subsystems.Elbow;
import org.frc1675.subsystems.Lift;
import org.frc1675.subsystems.MecanumDrive;
import org.frc1675.subsystems.RollerClaw;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static MecanumDrive mecanumDrive = new MecanumDrive();
    public static Lift lift = new Lift();
    public static Elbow elbow = new Elbow();
    public static RollerClaw rollerClaw = new RollerClaw();
    
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(mecanumDrive);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
