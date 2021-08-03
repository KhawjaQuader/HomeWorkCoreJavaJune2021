package hw8Q6Abstraction03;

import hw7Q4Abstraction02.NYUniversity;

/*e) Create another Abstract Class EngineeringSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. Print something inside the non abstract or implemented method . 
 */
//EngineeringSchool extends NYUniversity.
public abstract class EngineeringSchool extends NYUniversity {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("The name of the method is Computer Lab  ");
	}

	public EngineeringSchool() {// Constructor inside Abstract Class

	}

}
