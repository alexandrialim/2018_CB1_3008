package org.usfirst.frc.team3008.robot.subsystems;

import org.usfirst.frc.team3008.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TestPort_Subsystem extends Subsystem {
	static Spark S5 = new Spark(RobotMap.Arm);
	
	public TestPort_Subsystem(){
	}
	
	public void forward(){ 
		
		S5.set(1);
		//return true;
	}
	public void stop(){ 
		S5.set(0);
		//return true;
	}
	public void Back(){ 
		S5.set(-1);
		//return true;
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(null);
		
	}
	
}

