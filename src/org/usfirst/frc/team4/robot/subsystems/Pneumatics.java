package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.Compressor;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Pneumatics extends Subsystem{

	private static Compressor compressor = new Compressor(RobotMap.PNEUMATICS_COMPRESSOR);
	private static DoubleSolenoid leftArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_LEFT_FWD, RobotMap.PNEUMATICS_ARM_LEFT_BWD);
	private static DoubleSolenoid rightArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_RIGHT_FWD, RobotMap.PNEUMATICS_ARM_RIGHT_BWD);
	private static DoubleSolenoid leftClaw = new DoubleSolenoid(RobotMap.PNEUMATICS_CLAW_LEFT_FWD, RobotMap.PNEUMATICS_CLAW_LEFT_RWD);
	private static DoubleSolenoid rightClaw = new DoubleSolenoid(RobotMap.PNEUMATICS_CLAW_RIGHT_FWD, RobotMap.PNEUMATICS_CLAW_RIGHT_RWD);
	
	protected void initDefaultCommand() {
	}
	
	 
	
	

}
