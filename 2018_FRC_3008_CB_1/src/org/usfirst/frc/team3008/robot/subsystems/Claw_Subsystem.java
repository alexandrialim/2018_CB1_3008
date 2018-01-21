package org.usfirst.frc.team3008.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3008.robot.commands.clawControl_Command;
import com.ctre.phoenix.motorcontrol.can.*;

import org.usfirst.frc.team3008.robot.RobotMap;
import org.usfirst.frc.team3008.robot.commands.DriveControl_Command;
import org.usfirst.frc.team3008.robot.commands.clawControl_Command;
public class Claw_Subsystem extends Subsystem{
	WPI_TalonSRX c1;
	
	public Claw_Subsystem(){
		c1 = new WPI_TalonSRX(RobotMap.claw);
		// boolean clawOn = false;
		// boolean clawOff = false;
	}
	public void setClaw(){ 
		c1.set(1);
		//return true;
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new clawControl_Command());
		
	}




}
