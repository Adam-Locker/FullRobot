package org.usfirst.frc.team4.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class RobotMap {
	
	public static final int
	//Joystick
	OP_STICK					= 0,
	DRIVER_STICK				= 1,
	
	CONT_A						= 1,
	CONT_B						= 2,
	CONT_X						= 3,
	CONT_Y						= 4,
	
	CONT_LB						= 5,
	CONT_RB						= 6,
	
	CONT_LT						= 2,
	CONT_RT						= 3,

	CONT_SELECT					= 7,
	CONT_START					= 8,	
	
	CONT_L3						= 9,
	CONT_R3						= 10,
	
	CONT_LX						= 0,
	CONT_LY						= 1,
	
	CONT_RX						= 4,
	CONT_RY						= 5,
	
	//Chassis
	CHASSIS_MOTOR_LEFTFRONT 	= 2,
	CHASSIS_MOTOR_LEFTREAR 		= 3,
	CHASSIS_MOTOR_RIGHTFRONT	= 4,
	CHASSIS_MOTOR_RIGHTREAR 	= 5,
	
	//Pneumatics
	PNEUMATICS_COMPRESSOR 		= 1,
	
	PNEUMATICS_ARM_LEFT_FWD 	= 0,
	PNEUMATICS_ARM_LEFT_BWD 	= 1,
	PNEUMATICS_ARM_RIGHT_FWD 	= 2,
	PNEUMATICS_ARM_RIGHT_BWD 	= 3,
	
	PNEUMATICS_CLAW_LEFT_FWD	= 4,
	PNEUMATICS_CLAW_LEFT_RWD	= 5,
	PNEUMATICS_CLAW_RIGHT_FWD	= 6,
	PNEUMATICS_CLAW_RIGHT_RWD	= 7,
	
	//Intake
	INTAKE_LEFT					= 6,
	INTAKE_RIGHT				= 1,
	
	//Elevator
	Elevator_Motor				= 0;
	
	public static Joystick
	driverCont,
	opCont;
	
	public static JoystickButton
	//Drive Joystick
	driveA,
	driveB,
	driveX,
	driveY,
	
	drivLB,
	driveRB,
	
	driveLT,
	driveRT,
	
	driveSelect,
	driveStart,
	
	driveL3,
	driveR3,
	
	//OP Joystick
	
	opA,
	opB,
	opX,
	opY,
	
	opLB,
	opRB,
	
	opLT,
	opRT,
	
	opSelect,
	opStart,
	
	opL3,
	opR3;
	
	public static void init(){
		driverCont		= new Joystick(DRIVER_STICK);
		
		driveA			= new JoystickButton(driverCont, CONT_A);
		driveB			= new JoystickButton(driverCont, CONT_B);
		driveX			= new JoystickButton(driverCont, CONT_X);
		driveY			= new JoystickButton(driverCont, CONT_Y);
		
		drivLB			= new JoystickButton(driverCont, CONT_LB);
		driveRB			= new JoystickButton(driverCont, CONT_RB);
		
		driveLT			= new JoystickButton(driverCont, CONT_LT);
		driveRT			= new JoystickButton(driverCont, CONT_RT);
		
		driveSelect		= new JoystickButton(driverCont, CONT_SELECT);
		driveStart		= new JoystickButton(driverCont, CONT_START);
		
		driveL3			= new JoystickButton(driverCont, CONT_L3);
		driveR3			= new JoystickButton(driverCont, CONT_R3);
		
		//OP Joystick
		
		opA			= new JoystickButton(opCont, CONT_A);
		opB			= new JoystickButton(opCont, CONT_B);
		opX			= new JoystickButton(opCont, CONT_X);
		opY			= new JoystickButton(opCont, CONT_Y);
		
		opLB		= new JoystickButton(opCont, CONT_LB);
		opRB		= new JoystickButton(opCont, CONT_RB);
		
		opLT		= new JoystickButton(opCont, CONT_LT);
		opRT		= new JoystickButton(opCont, CONT_RT);
		
		opSelect	= new JoystickButton(opCont, CONT_SELECT);
		opStart		= new JoystickButton(opCont, CONT_START);
		
		opL3		= new JoystickButton(opCont, CONT_L3);
		opR3 		= new JoystickButton(opCont, CONT_R3);
	}
}