package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenixpro.signals.NeutralModeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

  private TalonFX armMotor;

  //add motors here
  public ArmSubsystem() {
    // TODO: Fix the ID of the arm motor later
    armMotor = new TalonFX(0);
    armMotor.setInverted(false);
  }

  //consider what methods are necessary for the motor to run effectively
    public void setArmPower(double power) {
        armMotor.set(ControlMode.PercentOutput, power);
    }
    
    public void stopArm() {
        armMotor.set(ControlMode.PercentOutput, 0);
    }

    public void coast() {
        armMotor.setNeutralMode(NeutralMode.Coast);
    }


  @Override
  public void periodic() {}
}
