// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Conveyor_Subsystem;

public class ConveyorCommand extends CommandBase {
  private final Conveyor_Subsystem Conveyor_Subsystem;
  public ConveyorCommand(Conveyor_Subsystem conveyor_Subsystem) {
    this.Conveyor_Subsystem = conveyor_Subsystem;
    addRequirements(conveyor_Subsystem);
  }

  @Override
  public void initialize() {
    
  }

  @Override
  public void execute() {
    Conveyor_Subsystem.Conveyor_In();
  }

  @Override
  public void end(boolean interrupted) {
    Conveyor_Subsystem.Conveyor_Stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
