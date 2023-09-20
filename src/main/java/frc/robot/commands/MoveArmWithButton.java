package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmWithButton extends CommandBase {
    /** Creates a new MoveArmWithJoystick. */
    ArmSubsystem armSubsystem;

    //initialize your subsystems, controllers
    XboxController button1;
    public MoveArmWithButton(ArmSubsystem armSubsystem, XboxController button1) {
        //add your parameters to the command
        // Use addRequirements() here to declare subsystem dependencies.
        this.button1 = button1;
        this.armSubsystem = armSubsystem;
    }

    @Override
    public void initialize() {
        armSubsystem.coast();
    }

    @Override
    public void execute() {
        // set the armPower to a certain power if a button is pressed or not(left bumper)
        if(button1.getLeftBumper()) {
            armSubsystem.coast();
            armSubsystem.setArmPower(0.5);
        } else {
            armSubsystem.coast();
            armSubsystem.setArmPower(0);
        }
    }


    @Override
    public void end(boolean interrupted) {
        armSubsystem.coast();
        armSubsystem.stopArm();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
