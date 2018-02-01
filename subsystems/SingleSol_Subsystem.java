package org.usfirst.frc.team3008.robot.subsystems;

import org.usfirst.frc.team3008.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SingleSol_Subsystem extends Subsystem{
	public Solenoid SS;
	
	public SingleSol_Subsystem(){
		SS = new Solenoid(RobotMap.SS);
	}
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(null);
		
	} 
	
	

}
