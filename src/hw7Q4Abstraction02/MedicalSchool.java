package hw7Q4Abstraction02;

import hw6Q4Abstraction01.EngineeringSchool;

/*
 * d) Create an Abstract Class MedicalSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab. Print something inside the non abstract or implemented method
 */
public abstract class MedicalSchool extends EngineeringSchool implements University {

	public void anatomyLab() {
		System.out.println("The method is implemented");
	}

	public abstract void biochemistryLab();

	public MedicalSchool() {// Constructor inside Abstract Class

	}

}
