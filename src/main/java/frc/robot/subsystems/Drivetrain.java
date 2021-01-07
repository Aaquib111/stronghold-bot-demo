// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  private final SpeedControllerGroup left = new SpeedControllerGroup(new Spark(Constants.FRONT_L),
                                                                     new Spark(Constants.BACK_L));

  private final SpeedControllerGroup right  = new SpeedControllerGroup(new Spark(Constants.FRONT_R),
                                                                       new Spark(Constants.BACK_R));

  private final DifferentialDrive drive = new DifferentialDrive(left, right);

  public Drivetrain() {
    drive.setSafetyEnabled(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void tankDrive(double leftSpeed, double rightSpeed){
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}
