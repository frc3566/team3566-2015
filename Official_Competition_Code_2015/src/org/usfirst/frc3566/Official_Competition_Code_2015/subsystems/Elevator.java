// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.Official_Competition_Code_2015.subsystems;

import org.usfirst.frc3566.Official_Competition_Code_2015.Robot;
import org.usfirst.frc3566.Official_Competition_Code_2015.RobotConstants;
import org.usfirst.frc3566.Official_Competition_Code_2015.RobotMap;
import org.usfirst.frc3566.Official_Competition_Code_2015.commands.*;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Elevator extends Subsystem {
	
	public final double ElevatorZeroPoint = 1.9;
	
	TalonSRX Elevator_A = RobotMap.elevatorElevator_A;
    TalonSRX Elevator_B = RobotMap.elevatorElevator_B;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    AnalogPotentiometer positionPotentiometer = RobotMap.elevatorPositionPotentiometer;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    /**
     * This function uses motor A to raise elevator
     */
    public void raiseElevator_A(){
    	Elevator_A.set(RobotConstants.Robot_Elevator_RaiseSpeed_A_Coefficient);
    }
    /**
     * This function stops motor A to stop elevator
     */
    public void stopElevator_A(){
    	Elevator_A.set(0.0);
    }
    /**
     * This function uses motor A to lower elevator
     */
    public void lowerElevator_A(){
    	Elevator_A.set(RobotConstants.Robot_Elevator_LowerSpeed_A_Coefficient);
    }
    /**
     * This function uses motor B to raise elevator
     */
    public void raiseElevator_B(){
    	Elevator_B.set(RobotConstants.Robot_Elevator_RaiseSpeed_B_Coefficient);
    }
    
    public void raiseElevator() {
    	raiseElevator_A();
    	raiseElevator_B();
    }
    
    public void lowerElevator() {
    	lowerElevator_A();
    	lowerElevator_B();
    }
    
    public void stopElevator() {
    	stopElevator_A();
    	stopElevator_B();
    }
    
    /**
     * This function stops motor B to stop elevator
     */
    public void stopElevator_B(){
    	Elevator_B.set(0.0);
    }
    /**
     * This function uses motor B to lower elevator
     */
    public void lowerElevator_B(){
    	Elevator_B.set(RobotConstants.Robot_Elevator_LowerSpeed_B_Coefficient);
    }
    
    public double getPositionPotentiometer(){
    	return positionPotentiometer.get();
    }
}

