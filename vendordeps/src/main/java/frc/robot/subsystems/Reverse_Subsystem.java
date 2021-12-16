// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Reverse_Subsystem extends SubsystemBase {
  public static boolean reverseLock = false;

  public Reverse_Subsystem() {
  }

  @Override
  public void periodic() {
  }

  public void ReverseTrue() {
    Intake_Subsystem.IntakeMotor.setInverted(true);
    Conveyor_Subsystem.ConveyorMotor.setInverted(false);
    Shooter_Subsystem.m_shooter.setInverted(true);
  }

  public void ReverseFalse() {
    Intake_Subsystem.IntakeMotor.setInverted(false);
    Conveyor_Subsystem.ConveyorMotor.setInverted(true);
    Shooter_Subsystem.m_shooter.setInverted(false);
  }
}
