package org.usfirst.frc.team3008.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
//////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////		//				//		//////////////
//////	  	 //			//			 //			   //		//
//////		 //			//			  //		  //		//
//////////////			//			   //		 //			////////
/////////				//				//		//			//
//////	 //				//				 //	   //			//
//////	   //			//				  //  //			//
///////			//	     //		///////////			   ////				/////////////
///////////////////////////////////////////////////////////////////////////////////////////
//Front Drive Wheel Port Numbers //

public static final int L1 = 1;
public static final int R1 = 2;

////////////////////////////////////////////////////////////////
//Back Drive Wheel Port Numbers //

public static final int L2 = 3;
public static final int R2 = 4;

/////////////////////////////////////////////////////////////////////////////////////////////
//Other Variables // // those are examples....
public static final int claw = 0;
public static final int Arm = 5; 
public static final int Elevator = 7;

///////////////////////////////////////////////////
public static final int liftLim = 0;
public static final int dioR = 9;
public static final int dioG = 7;
public static final int dioY = 8;

}
