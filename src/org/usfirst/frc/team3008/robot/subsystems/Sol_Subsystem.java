package org.usfirst.frc.team3008.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Sol_Subsystem extends Subsystem{
	
	public DoubleSolenoid DS;
	
	public Sol_Subsystem(){
		DS = new DoubleSolenoid(1,2);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(null);
		
	}

}
