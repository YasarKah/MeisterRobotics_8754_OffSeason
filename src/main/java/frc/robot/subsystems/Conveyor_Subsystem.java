package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class Conveyor_Subsystem extends SubsystemBase {
  public final static WPI_VictorSPX ConveyorMotor = new WPI_VictorSPX(MotorConstants.Conveyor_Motor_Port);

  public Conveyor_Subsystem() {
      ConveyorMotor.setInverted(true);
    
  }

  @Override
  public void periodic() {
  }
  public void Conveyor_In(){
    ConveyorMotor.set(1);
  }
  public void Conveyor_Out(){
    ConveyorMotor.set(-1);
  }
  public void Conveyor_Stop(){
    ConveyorMotor.set(0);
  }
}
