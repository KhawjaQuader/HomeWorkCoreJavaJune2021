package hw8Q6Abstraction03;

/*d) Create an Abstract Class MedicalSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab. Print something inside the non abstract or implemented method
 */
//MedicalSchool extends NursingSchool???.
public abstract class MedicalSchool extends NursingSchool {

	public void anatomyLab() {
		System.out.println("The name of the method is Anatomy Lab");
	}

	public abstract void biochemistryLab();

	public MedicalSchool() {// Constructor inside Abstract Class

	}

}
