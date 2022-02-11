// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.TimedRobot;



/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {
  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;


  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {

    m_led = new AddressableLED(9);
    m_ledBuffer = new AddressableLEDBuffer(60);
    m_led.setLength(m_ledBuffer.getLength());
    m_led.start();
    
    
    
  }
  @Override
  public void robotPeriodic() {
    
    setStaticColor();
    m_led.setData(m_ledBuffer);
  }

  public void setStaticColor() {
    for (var i = 0; i < m_ledBuffer.getLength(); i++) {
      //m_color = RobotPreferences.ColorPrefs.color.getValue();

      m_ledBuffer.setRGB(i, RobotPreferences.ColorPrefs.redPref.getValue(), RobotPreferences.ColorPrefs.greenPref.getValue(), RobotPreferences.ColorPrefs.bluePref.getValue());

    }
  }

  

  /** This function is run once each time the robot enters autonomous mode. */
  @Override
  public void autonomousInit() {
    
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    
  }

  /** This function is called once each time the robot enters teleoperated mode. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during teleoperated mode. */
  @Override
  public void teleopPeriodic() {
    

  }

  /** This function is called once each time the robot enters test mode. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
