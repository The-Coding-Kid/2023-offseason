package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmWithJoystick extends CommandBase {
  /** Creates a new MoveArmWithJoystick. */
  ArmSubsystem armSubsystem;

  //initialize your subsystems, controllers
  XboxController joystick1;
  public MoveArmWithJoystick(ArmSubsystem armSubsystem, XboxController joystick1) {
    //add your parameters to the command
    // Use addRequirements() here to declare subsystem dependencies.
    this.joystick1 = joystick1;
    this.armSubsystem = armSubsystem;
  }

  @Override
  public void initialize() {
    armSubsystem.coast();
  }

  @Override
  public void execute() {
    // set the armPower to a certain power if a button is pressed or not(left bumper)
    double joystickArmPower = joystick1.getLeftY(); //use this joystick armpower to set power to your motors
    armSubsystem.coast();
    armSubsystem.setArmPower(joystickArmPower);
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
