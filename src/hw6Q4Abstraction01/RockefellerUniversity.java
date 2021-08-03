package hw6Q4Abstraction01;
/*
 *v) Create a regular Class RockefellerUniversity, 
 *create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics.
 * if not possible to create, simply comment out the method and explain why in comment out. 
 * Print something inside the non-abstract or implemented method. 
 * Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 *  
 *  Now, answer how many keywords are used for the inheritance for a regular Class? 
 *  Can a regular Class inherit other Abstract Class or regular class or interface? 
 *  How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions.
 *  You don't need to execute anything as the main method is absent. 
 *  Organize the code. 
 *  Push the code in Github. 
 *  Paste your github link below.
 */

public class RockefellerUniversity  {//Regular class
	
	//public abstract void math();Left side Abstract method declared in nature
	//and In regular class we can not Declare methods


	public void statistics() {//Non Abstract or Implemented Method
		System.out.println("The name of the method is Statistic");
	}
//Regular Class can inherit only one regular or one Abstract Class and can not inherit
	public RockefellerUniversity() {
		// Default Constructor inside a regular Class created
		// Abstract method declared in nature as we can not declared method inside Regular class 
	}
	
	//Regular class use 2 keywords for inheritance with extends and Implements keyword
	//Regular class can Inherit 1 Regular or 1 Abstract class with extends keyword
}   //Regular class can Inherit more then 1 interface by Implements key word 

