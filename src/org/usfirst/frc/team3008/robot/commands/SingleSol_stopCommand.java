package org.usfirst.frc.team3008.robot.commands;

import org.usfirst.frc.team3008.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class SingleSol_stopCommand extends Command{
	
	public SingleSol_stopCommand(){
		requires(Robot.SingleSol_Subsystem);
	}
	// Called repeatedly when this Command is scheduled to run
		@Override
	protected void execute() {		
		Robot.SingleSol_Subsystem.SS.set(true);
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
