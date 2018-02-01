package org.usfirst.frc.team3008.robot.subsystems;

import org.usfirst.frc.team3008.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.WaitUntilCommand;

public class Lift_Subsystem extends Subsystem{
	Spark LiftS = new Spark(RobotMap.Elevator);
	DigitalInput liftLim = new DigitalInput(RobotMap.liftLim);

	public Lift_Subsystem(){
	}
	public void UpLift(){ 
		LiftS.set(1);
		//return true;
	}
	public void stopLift(){ 
		LiftS.set(0);
		//return true;
	}
	public void closeLift(){ 
		LiftS.set(-1);
		//return true;
	}
	public void lowerTillSwitch(){
		if(liftLim.get()){
			LiftS.set(1);	
		}
		else{
			LiftS.set(-1);
		}
		
	}
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(null);
		
	}

}
