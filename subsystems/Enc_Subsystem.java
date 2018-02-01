package org.usfirst.frc.team3008.robot.subsystems;

import org.usfirst.frc.team3008.robot.RobotMap;
import org.usfirst.frc.team3008.robot.commands.Enc_Command;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Enc_Subsystem extends Subsystem{

		Encoder encL = new Encoder(RobotMap.encLA, RobotMap.encLB, false, EncodingType.k1X);
		Encoder encR = new Encoder(RobotMap.encRA, RobotMap.encRB, false, EncodingType.k1X);
		

		public Enc_Subsystem(){
			
		}
		public int getEncR(){ 
			
			return encR.get();
		}
		public int getEncL(){ 
			
			return encL.get();
		}
		
		@Override
		protected void initDefaultCommand() {
			setDefaultCommand(new Enc_Command());
			
		}

}
