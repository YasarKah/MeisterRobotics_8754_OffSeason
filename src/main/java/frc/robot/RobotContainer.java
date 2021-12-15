// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.TeleDriveCommand;
import frc.robot.subsystems.Drive_Subsystem;

public class RobotContainer {
  public final Drive_Subsystem m_drive = new Drive_Subsystem();
  
  Joystick driver_Controller = new Joystick(0);

  public RobotContainer() {
    m_drive.setDefaultCommand(new TeleDriveCommand(driver_Controller, m_drive));
    configureButtonBindings();
  }

  private void configureButtonBindings() {
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
