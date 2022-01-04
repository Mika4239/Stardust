// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase {
  DoubleSupplier leftSupplier, rightSupplier;
  private final DriveTrain m_driveTrain;

  public TankDrive(DriveTrain m_driveTrain2, DoubleSupplier leftSupplier, DoubleSupplier rightSupplier) {

    this.m_driveTrain = m_driveTrain2;
    addRequirements(m_driveTrain2);

    this.leftSupplier = leftSupplier;
    this.rightSupplier = rightSupplier;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrain.setPercent(leftSupplier.getAsDouble(), rightSupplier.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_driveTrain.setPercent(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
