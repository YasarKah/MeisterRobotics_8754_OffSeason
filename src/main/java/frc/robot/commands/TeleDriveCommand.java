// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.JoystickConstants;
import frc.robot.subsystems.Drive_Subsystem;

public class TeleDriveCommand extends CommandBase {

  private final Joystick driver_Controller;
  private final Drive_Subsystem drive_Subsystem;

  public TeleDriveCommand(Joystick driver_Controller, Drive_Subsystem drive_Subsystem) {
    this.driver_Controller = driver_Controller;
    this.drive_Subsystem = drive_Subsystem;
    addRequirements(drive_Subsystem);
  }

  @Override
  public void initialize() {}

@Override
  public void execute() {
    
    drive_Subsystem.arcadeDrive(getSpeed(), getRotation(),true);

  }
  private double getSpeed() {
    double speed =-driver_Controller.getRawAxis(JoystickConstants.StickAxisY);
    double paddle = driver_Controller.getRawAxis(JoystickConstants.Slider);
    System.out.println("Speed: "+ speed);
    /*System.out.println("Paddle: "+ paddle);
    System.out.println("Speed*Paddle: "+ speed*paddle);*/
    double test = 0;
    return test;
  }
  private double getRotation() {
    double rotation = -driver_Controller.getRawAxis(JoystickConstants.StickRotate);
    return rotation;
  }
  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
