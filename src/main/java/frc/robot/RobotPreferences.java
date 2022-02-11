package frc.robot;

import com.frcteam3255.preferences.SN_IntPreference;


public final class RobotPreferences {
    public static final class ColorPrefs {
        public static final SN_IntPreference redPref = new SN_IntPreference("red", 255);
        public static final SN_IntPreference bluePref = new SN_IntPreference("blue", 0);
        public static final SN_IntPreference greenPref = new SN_IntPreference("green", 0);
    }
    
}
