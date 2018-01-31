package org.usfirst.frc.team3008.robot.commands;

import org.usfirst.frc.team3008.robot.OI;
import org.usfirst.frc.team3008.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Enc_Command extends Command{
	
	public Enc_Command(){
	
		requires(Robot.Enc_Subsystem);
		
	}

	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		System.out.println("EncoderR Degree Rotations:" + Robot.Enc_Subsystem.getEncR());
		System.out.println("EncoderL Degree Rotations:" + Robot.Enc_Subsystem.getEncL());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
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
