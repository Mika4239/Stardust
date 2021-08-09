// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {

    public static final class DriveTrain {

        public static final class TalonR {
            public static final int TALONR_ID = 1;
            public static final boolean inverted = true;
        }

        public static final class TalonL {
            public static final int TALONL_ID = 2;
            public static final boolean inverted = true;
        }

        public static final class VictorRF {
            public static final int VICTORRF_ID = 3;
            public static final boolean inverted = true;
        }

        public static final class VictorRB {
            public static final int VICTORRB_ID = 4;
            public static final boolean inverted = true;
        }

        public static final class VictorLF {
            public static final int VICTORLF_ID = 5;
            public static final boolean inverted = true;
        }

        public static final class VictorLB {
            public static final int VICTORLB_ID = 6;
            public static final boolean inverted = true;
        }  
    }

    public static final class Joysticks {

        public static final class LeftJoystick  {
            public static final int LEFT_JOYSTICK_PORT = 0;
        }

        public static final class RightJoystick  {
            public static final int RIGHT_JOYSTICK_PORT = 1;
        }

    }
}
