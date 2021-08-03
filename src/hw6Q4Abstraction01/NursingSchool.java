package hw6Q4Abstraction01;

/* Create another Abstract Class NursingSchool, 
 * Create another Abstract Class NursingSchool, 
 * create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. 
 * Print something inside the non-abstract or implemented method.
 * Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not?
 *
 * Now, answer how many keywords are used for the inheritance of Abstract Class?
 * Can an Abstract Class inherit other Abstract Class or a regular class or interface? 
 * How many inheritances is possible by an Abstract Class?
 * Use the all of above Abstract Classes (3) to answer my questions.
 */

public abstract class NursingSchool implements University,Hospital,College{

	public abstract void hygine();//Abstract method

	public void caring() {//Non Abstract method or implemented method
		System.out.println("This is Caring Method");

	}

	public NursingSchool() {//Default constructor created
	}
		// Default Constructor created inside Abstract Class
		///Abstract class use 2 keyword for inheritance extends and Implements keyword
		// Abstract Class inherit 1 Abstract or 1 Regular class by extends keyword
		// Abstract class can not Inherit Interface by extends key word
		// Abstract class can inherit Interface by Implement keyword more then 1
	 
	}

