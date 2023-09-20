package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

  WPI_TalonFX armMotor;

  //add motors here
  public ArmSubsystem() {
    // TODO: Fix the ID of the arm motor later
    armMotor = new WPI_TalonFX(0);
    armMotor.setInverted(false);
  }

  //consider what methods are necessary for the motor to run effectively
    public void setArmPower(double power) {
        armMotor.set(power);
    }
    
    public void stopArm() {
        armMotor.set(0);
    }

    public void coast() {
        armMotor.setNeutralMode(NeutralMode.Coast);
    }

  public double getPower() {
    return armMotor.get();
  }

  @Override
  public void periodic() {}
}
