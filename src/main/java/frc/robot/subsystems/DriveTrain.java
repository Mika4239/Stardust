// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  
  private TalonSRX _talonR, _talonL;
  private VictorSPX _victorRF, _victorRB, _victorLF, _victorLB;

  private DoubleSolenoid _shifter;

  public DriveTrain() {

    this._talonR = new TalonSRX(0);
    this._talonL = new TalonSRX(1);
    this._victorRF = new VictorSPX(2);
    this._victorRB = new VictorSPX(3);
    this._victorLF = new VictorSPX(4);
    this._victorLB = new VictorSPX(5);

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

  public void setDistance(double distanceR, double distanceL) {
    this._talonL.set(ControlMode.Position, distanceR);
    this._talonL.set(ControlMode.Position, distanceL);
  }


  public void setRightVelocity(double velocity){
    this._talonR.set(ControlMode.Velocity, velocity);
  }

  public void setLeftVelocity(double velocity){
    this._talonL.set(ControlMode.Velocity, velocity);
  }

  public void setBothVelocity(double velocityR, double velocityL){
    this._talonR.set(ControlMode.Velocity, velocityR);
    this._talonL.set(ControlMode.Velocity, velocityL);
  }

  public void setVelocity(double velocity){
    this._talonL.set(ControlMode.Velocity, velocity);
    this._talonR.set(ControlMode.Velocity, velocity);
  }

  public void setRightPercentage(double precent){
    this._talonR.set(ControlMode.PercentOutput, precent);
  }

  public void setLeftPercentage(double precent){
    this._talonL.set(ControlMode.PercentOutput, precent);
  }

  public void setBothPercentage(double precentR, double precentL){
    this._talonR.set(ControlMode.PercentOutput, precentR);
    this._talonL.set(ControlMode.PercentOutput, precentL);
  }

  public void setPercentage(double precent){
    this._talonR.set(ControlMode.PercentOutput, precent);
    this._talonL.set(ControlMode.PercentOutput, precent);
  }

  public enum gearState {
    HIGH, LOW, OFF;
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
