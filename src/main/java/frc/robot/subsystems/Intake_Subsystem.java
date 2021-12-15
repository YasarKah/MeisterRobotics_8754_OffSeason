package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class Intake_Subsystem extends SubsystemBase {
  private final WPI_VictorSPX IntakeMotor = new WPI_VictorSPX(MotorConstants.Intake_Motor_Port);
  private boolean intake_state = false;
  
  public Intake_Subsystem() {
    IntakeMotor.setSafetyEnabled(false);
  }

  @Override
  public void periodic() {
  }
  public void IntakeSystem() {
    if (!intake_state) {
      intake_Start();
      intake_state = true;
    } else {
      intake_Stop();
      intake_state = false;
    }
  }
  public void intake_Start() {
    IntakeMotor.set(1);
  }
  public void intake_Stop() {
    IntakeMotor.set(0);
  }
}
