package org.usfirst.frc.team3008.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3008.robot.commands.clawControlOpen_Command;
import com.ctre.phoenix.motorcontrol.can.*;

import org.usfirst.frc.team3008.robot.RobotMap;
import org.usfirst.frc.team3008.robot.commands.DriveControl_Command;
import org.usfirst.frc.team3008.robot.commands.clawControlOpen_Command;
public class Claw_Subsystem extends Subsystem{
	WPI_TalonSRX c1 = new WPI_TalonSRX(RobotMap.claw);
	
	public Claw_Subsystem(){
		c1 = new WPI_TalonSRX(RobotMap.claw);
		// boolean clawOn = false;
		// boolean clawOff = false;
	}
	public void startClaw(){ 
		
		c1.set(1);
		//return true;
	}
	public void stopClaw(){ 
		c1.set(0);
		//return true;
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(null);
		
	}




}
