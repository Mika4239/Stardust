// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  private TalonSRX _talonR, _talonL;
  private VictorSPX _victorRF, _victorRB, _victorLF, _victorLB;

  public DriveTrain() {

    this._talonR = new TalonSRX(Constants.DriveTrain.TalonL.ID);
    this._talonL = new TalonSRX(Constants.DriveTrain.TalonR.ID);
    this._victorRF = new VictorSPX(Constants.DriveTrain.VictorRF.ID);
    this._victorRB = new VictorSPX(Constants.DriveTrain.VictorRB.ID);
    this._victorLF = new VictorSPX(Constants.DriveTrain.VictorLF.ID);
    this._victorLB = new VictorSPX(Constants.DriveTrain.VictorLB.ID);

    this._victorRF.follow(_talonR);
    this._victorRB.follow(_talonR);
    this._victorLF.follow(_talonL);
    this._victorLB.follow(_talonL);

    this._talonL.setInverted(Constants.DriveTrain.TalonL.inverted);
    this._talonR.setInverted(Constants.DriveTrain.TalonR.inverted);
    this._victorRB.setInverted(Constants.DriveTrain.VictorRB.inverted);
    this._victorRF.setInverted(Constants.DriveTrain.VictorRF.inverted);
    this._victorLF.setInverted(Constants.DriveTrain.VictorLF.inverted);
    this._victorLB.setInverted(Constants.DriveTrain.VictorLB.inverted);

  }

  private void setRightPercent(double percentage) {
    this._talonR.set(ControlMode.PercentOutput, percentage);
  }

  private void setLeftPercent(double percentage) {
    this._talonL.set(ControlMode.PercentOutput, percentage);
  }

  public void setPercent(double percentageL, double percentageR) {
    setRightPercent(percentageR);
    setLeftPercent(percentageL);
  }

  public void setPercent(double percentage) {
    setRightPercent(percentage);
    setLeftPercent(percentage);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
