package hw7Q4Abstraction02;

import hw6Q4Abstraction01.NursingSchool;

/*e) Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . 
 */
public abstract class EngineeringSchool extends NursingSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("The method name is Computer Lab  ");
	}

	public EngineeringSchool() {// Constructor inside Abstract Class

	}

}
