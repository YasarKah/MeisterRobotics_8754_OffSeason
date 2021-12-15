// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Reverse_Subsystem;

public class ReverseCommand extends CommandBase {

  private final Reverse_Subsystem Reverse_Subsystem;

  public ReverseCommand(Reverse_Subsystem reverse_Subsystem) {
    this.Reverse_Subsystem = reverse_Subsystem;
    addRequirements(reverse_Subsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    Reverse_Subsystem.ReverseTrue();
  }

  @Override
  public void end(boolean interrupted) {
    Reverse_Subsystem.ReverseFalse();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
