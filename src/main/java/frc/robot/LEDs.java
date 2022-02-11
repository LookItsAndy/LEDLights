// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LEDs extends SubsystemBase {
  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;
  /** Creates a new LEDS. */
  public LEDs() {
    m_led = new AddressableLED(9);
    m_ledBuffer = new AddressableLEDBuffer(60);
    m_led.setLength(m_ledBuffer.getLength());

    m_led.start();

  }

  public void setColor() {
    for (var i = 0; i < m_ledBuffer.getLength(); i++) {
      m_ledBuffer.setRGB(i, RobotPreferences.ColorPrefs.redPref.getValue(), RobotPreferences.ColorPrefs.greenPref.getValue(), RobotPreferences.ColorPrefs.bluePref.getValue());
    }


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setColor();
    m_led.setData(m_ledBuffer);
  }
}
