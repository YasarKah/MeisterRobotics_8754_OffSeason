// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class Shooter_Subsystem extends SubsystemBase {
  final static WPI_VictorSPX m_shooter = new WPI_VictorSPX(MotorConstants.Shooter_Motor_Port);
  private boolean shooter_state = false;

  public Shooter_Subsystem() {}

  @Override
  public void periodic() {
  }
  public void shoot() {
    if (!shooter_state) {
      shoot_Start();
      shooter_state = true;
    } else {
      shoot_Stop();
      shooter_state = false;
    }
  }
  public void shoot_Start() {
    m_shooter.set(1);
  }
  public void shoot_Stop() {
    m_shooter.set(0);
  }
}
