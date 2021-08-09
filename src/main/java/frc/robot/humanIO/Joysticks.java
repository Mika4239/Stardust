package frc.robot.humanIO;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;

public class Joysticks {
    
    private Joystick _leftJoystick, _rightJoystick;

    public Joysticks() {
        this._leftJoystick = new Joystick(Constants.Joysticks.LeftJoystick.LEFT_JOYSTICK_PORT);
        this._rightJoystick = new Joystick(Constants.Joysticks.RightJoystick.RIGHT_JOYSTICK_PORT);
    }

    public double getLeftY(){
        return this._leftJoystick.getY();
    }

    public double getLeftX(){
        return this._leftJoystick.getX();
    }

    public double getRightY(){
        return this._rightJoystick.getY();
    }

    public double getRightX(){
        return this._rightJoystick.getX();
    }
}
