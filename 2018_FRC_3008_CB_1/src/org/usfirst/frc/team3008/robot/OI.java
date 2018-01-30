package org.usfirst.frc.team3008.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3008.robot.RobotMap;

//AKA JoyStick 

import org.usfirst.frc.team3008.robot.commands.ExampleCommand;
import org.usfirst.frc.team3008.robot.commands.LiftLimitReverse_Command;
import org.usfirst.frc.team3008.robot.commands.LiftLimitUp_Command;
import org.usfirst.frc.team3008.robot.commands.LiftLimitStop_Command;
import org.usfirst.frc.team3008.robot.commands.LiftLimit_Command;
import org.usfirst.frc.team3008.robot.commands.TestPortsBackwards_Command;
import org.usfirst.frc.team3008.robot.commands.clawControlClose_Command;
import org.usfirst.frc.team3008.robot.commands.clawControlStop_Command;
import org.usfirst.frc.team3008.robot.subsystems.Drive_Subsystem;
import org.usfirst.frc.team3008.robot.subsystems.Claw_Subsystem;

import org.usfirst.frc.team3008.robot.commands.clawControlOpen_Command;
import org.usfirst.frc.team3008.robot.commands.TestPortsForward_Commands;
import org.usfirst.frc.team3008.robot.commands.TestPortsStop_Command;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	  static Joystick joy1 = new Joystick(0);
	  Button clawOpen = new JoystickButton(joy1, 2); //Button B
	  Button clawClose = new JoystickButton(joy1, 1); //Button A
	  Button TestOpen = new JoystickButton(joy1, 3); //Button X
	  Button TestClose = new JoystickButton(joy1, 4); //Button Y
	  
	 public OI() {
		 clawOpen.whenInactive(new clawControlStop_Command());
		 clawOpen.whenPressed( new clawControlOpen_Command());	
		 clawClose.whenInactive(new clawControlStop_Command());
		 clawClose.whenPressed( new clawControlClose_Command());
		 
		 TestOpen.whenInactive(new LiftLimitStop_Command());
		 TestOpen.whenPressed( new LiftLimitUp_Command());	
		 TestClose.whenInactive(new LiftLimitStop_Command());
		 TestClose.whenPressed( new LiftLimitReverse_Command());
	 }
	  
	  
	/*
    public static double deadzone(double d){
    	if (Math.abs(d)< 0.15){
    		return 0;
    	}
    	return (d / Math.abs(d)) * ((Math.abs(d) - 0.15) /(1 - 0.15));
    }
    */
    public static double getLeftStickX() {
        return (joy1.getRawAxis(1));
    }
    
    public static double getRightStickX() {
        return (joy1.getRawAxis(5));
    }
   
}
    
    //Run Teleop Code:
   // public void run(){
    /*	joy1 = new Joystick(0);
    	xL = joy1.getX();
    	xR = joy1.getX();
    	yL = joy1.getY();
    	yR = joy1.getY();
    */	
  
    //	boolean buttonValue;
    	//buttonValue = joy1.getTrigger();
    	
    /*	if(joy1.getRawButton(1) == true){
    		//s1.set(true);
    	}*/
    	/*while (true){
    		x = joy1.getRawAxis(0);
    		y = joy1.getRawAxis(1);
    		
    	*/	
    		
		//	if (joy1.getRawButton(6))FRT.set(1); // FR motor (change later)
		//	else FRT.set(0);
    		    	//(look in RobotDrive.class)			
    	//}
    //}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

