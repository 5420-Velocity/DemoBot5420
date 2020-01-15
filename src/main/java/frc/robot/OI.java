/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  Joystick driverJoystick = new Joystick(RobotMap.JOYSTICK_USB_DRIVER);

  public double getSpeed(){
    return driverJoystick.getRawAxis(RobotMap.JOYSTICK_LEFT_Y_AXIS) * 0.5;
  }
  
  public double getTurn(){
    return driverJoystick.getRawAxis(RobotMap.JOYSTICK_RIGHT_X_AXIS);
  }
  

}
