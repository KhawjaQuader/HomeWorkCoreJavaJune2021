package hw6Q4Abstraction01;

/*d) Create an Abstract Class MedicalSchool, create 2 methods inside the Abstract Class - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab. Print something inside the non abstract or implemented method
 */
public abstract class MedicalSchool {

	public void anatomyLab() {
		System.out.println("The method is implemented");
	}

	public abstract void biochemistryLab();

	public MedicalSchool() {// Constructor inside Abstract Class

	}

}
