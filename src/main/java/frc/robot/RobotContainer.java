// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.frcteam3255.joystick.SN_DualActionStick;

/** Add your docs here. */
public class RobotContainer {
    public static final LEDs leds = new LEDs();


    public static SN_DualActionStick controller = new SN_DualActionStick(0);


    public static enableLEDs enableLight;

    public RobotContainer() {

        enableLight = new enableLEDs();

    }

    public static void configureButtonBinders() {
        controller.POV_North.whenPressed(enableLight);
    }
    
}
