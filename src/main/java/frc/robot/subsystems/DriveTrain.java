 /*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;

public class DriveTrain extends Subsystem {
  private CANSparkMax Left1;
  private CANSparkMax Left2;

  private CANSparkMax Right1;
  private CANSparkMax Right2;

  private DifferentialDrive Drive;

  public DriveTrain(){

    Left1.restoreFactoryDefaults();
    Left2.restoreFactoryDefaults();
    Right1.restoreFactoryDefaults();
    Right2.restoreFactoryDefaults();


    Left1.setOpenLoopRampRate(1.5);
    Left2.setOpenLoopRampRate(1.5);
    Right1.setOpenLoopRampRate(1.5);
    Right2.setOpenLoopRampRate(1.5);

    Left1.setIdleMode(IdleMode.kBrake);
    Left2.setIdleMode(IdleMode.kBrake);
    Right1.setIdleMode(IdleMode.kBrake);
    Right2.setIdleMode(IdleMode.kBrake);


    Left2.follow(Left1);
    Right2.follow(Right1);


    Drive = new DifferentialDrive(Left1, Right1);
  }

  public void arcadeDrive(double speed, double rotation){
    Drive.arcadeDrive(speed, rotation);
  }

  @Override
  public void initDefaultCommand() {
    
  }
 
}
 