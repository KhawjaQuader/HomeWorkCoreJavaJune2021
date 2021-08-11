package hw6Q4Abstraction01;

/*e) Create another Abstract Class EngineeringSchool, create 
 * 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab.
 *  Print something inside the non abstract or implemented method . 
 */

public abstract class EngineeringSchool extends NursingSchool {

	public abstract void mechanicalLab();//Abstract method Declared

	public void computerLab() {//Non Abstract Void method inside Abstract Class
		System.out.println("The method name is Computer Lab  ");
	}

	public EngineeringSchool() {// Default Constructor inside Abstract Class

	}

}
