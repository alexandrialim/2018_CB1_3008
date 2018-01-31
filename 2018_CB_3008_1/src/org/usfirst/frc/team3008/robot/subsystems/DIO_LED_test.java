package org.usfirst.frc.team3008.robot.subsystems;
import edu.wpi.first.wpilibj.DigitalOutput;
import org.usfirst.frc.team3008.robot.RobotMap;
public class DIO_LED_test {
	private static DigitalOutput dioR = new DigitalOutput(RobotMap.dioR);
	private boolean state;
	public void DIO_LED_test(){
		off();
	}
	private void set(boolean state) {
		this.state = state;
		dioR.set(state);
		
	}
	private void off() {
		set(false);
		
	}
	public void on(){
		set(true);
	}
}
