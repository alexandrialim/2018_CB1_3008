package org.usfirst.frc.team3008.robot.commands;

import org.usfirst.frc.team3008.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class clawControlClose_Command extends Command{
	
	public clawControlClose_Command(){
		requires(Robot.Claw_Subsystem);
	}


	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.Claw_Subsystem.closeClaw();
	
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
