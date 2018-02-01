package org.usfirst.frc.team3008.robot.commands;

import org.usfirst.frc.team3008.robot.OI;
import org.usfirst.frc.team3008.robot.Robot;
import org.usfirst.frc.team3008.robot.subsystems.Claw_Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3008.robot.OI;


public class clawControlOpen_Command extends Command{

	public clawControlOpen_Command(){
		

		requires(Robot.Claw_Subsystem);
		
	}


	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.Claw_Subsystem.startClaw();
	
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
