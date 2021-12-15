// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.JoystickConstants;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShootCommand;
import frc.robot.commands.TeleDriveCommand;
import frc.robot.subsystems.Drive_Subsystem;
import frc.robot.subsystems.Shooter_Subsystem;
import frc.robot.subsystems.Intake_Subsystem;
import frc.robot.commands.ConveyorCommand;
import frc.robot.subsystems.Conveyor_Subsystem;

public class RobotContainer {
  public final Drive_Subsystem m_drive = new Drive_Subsystem();
  public final Shooter_Subsystem m_shooter = new Shooter_Subsystem();
  public final Intake_Subsystem m_intake = new Intake_Subsystem();
  public final Conveyor_Subsystem m_conveyor = new Conveyor_Subsystem();
  
  Joystick driver_Controller = new Joystick(0);

  public RobotContainer() {
    m_drive.setDefaultCommand(new TeleDriveCommand(driver_Controller, m_drive));
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    new JoystickButton(driver_Controller, JoystickConstants.Ten).whenPressed(new ShootCommand(m_shooter));
    new JoystickButton(driver_Controller, JoystickConstants.Hand).whenPressed(new IntakeCommand(m_intake));
    new JoystickButton(driver_Controller, JoystickConstants.Tetik).whileHeld(new ConveyorCommand(m_conveyor));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
