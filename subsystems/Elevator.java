package org.usfirst.frc771.TestingMyCommand.subsystems;

import org.usfirst.frc771.TestingMyCommand.RobotMap;
import org.usfirst.frc771.TestingMyCommand.commands.*;
import org.usfirst.frc771.TestingMyCommand.OI;


import  edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Elevator extends Subsystem{
//	private final DigitalInput limitSwitch1 = RobotMap.LimitSwitch1;
//	private final DigitalInput limitSwitch2 = RobotMap.LimitSwitch2;
	
	int tomato = 0;
	
	
	
	public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand()); 
		
		
		
    }
	
	public void settomato(int value){
		tomato = value;
	}
	
	public int gettomato(){
		return tomato;
	}
	
}
