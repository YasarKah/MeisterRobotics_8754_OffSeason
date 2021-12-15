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

  public double in_min = 1;
  public double in_max = -1;
  public double out_max = 1;
  public double out_min = 0;

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
    double lastSpeed = map()*speed;
    return lastSpeed;
  }
  private double getRotation() {
    double rotation = driver_Controller.getRawAxis(JoystickConstants.StickRotate);
    double lastRotation = map()*rotation;
    return lastRotation;
  }
  private double map(){
    double paddle = driver_Controller.getRawAxis(JoystickConstants.Slider);
    double finalResult = ((paddle - in_min) * (out_max - out_min) / (in_max - in_min) + out_min);
    return finalResult;
  }
  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
