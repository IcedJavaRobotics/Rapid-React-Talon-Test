// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TalonFXTestSubsystem extends SubsystemBase {
  /** Creates a new TalonFXTestSubsystem. */
  
  final TalonFX testTalon;

  public TalonFXTestSubsystem() {
    
    testTalon = new TalonFX(Constants.TESTTALONFX);
    
  }
  
  public void spinMotor() {

    testTalon.set(ControlMode.PercentOutput, 0.5);

    SmartDashboard.putNumber("Test Talon Velocity", testTalon.getSelectedSensorVelocity());
    SmartDashboard.putNumber("Test Talon Position", testTalon.getSelectedSensorPosition());

  }
  
  public void stopMotor() {
    
    testTalon.set(ControlMode.PercentOutput, 0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
