package org.usfirst.frc.team3008.robot.commands;

import org.usfirst.frc.team3008.robot.OI;
import org.usfirst.frc.team3008.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftLimitStop_Command extends Command{

public LiftLimitStop_Command(){
		

		requires(Robot.Lift_Subsystem);
		
	}

	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.Lift_Subsystem.stopLift();
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
