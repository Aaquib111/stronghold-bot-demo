// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSystem extends SubsystemBase {
  /** Creates a new ShooterSystem. */

  private final Spark winch = new Spark(4);
  
  private final DoubleSolenoid shoot = new DoubleSolenoid(Constants.SHOOT_RETRACT, Constants.SHOOT_EXTEND);

  public ShooterSystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void toggleSolenoid(){
    if(shoot.get() == Value.kForward){
      shoot.set(Value.kReverse);
    }else{
      shoot.set(Value.kForward);
    }
  }

  public void primeCatapult(double speed){
    winch.setSpeed(speed);
  }
}
