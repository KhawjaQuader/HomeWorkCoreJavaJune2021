package hw8Q6Abstraction03;

/*Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method.Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.
 *    
 */
public abstract class NursingSchool extends MedicalSchool implements University, College {

	public abstract void hygine();

	public void caring() {
		System.out.println("This is Caring Method");

	}

	public NursingSchool() {// Constructor inside Abstract Class
		// used for the inheritance of Abstract Class one key word
		// Abstract Class inherit other Abstract Class only one
		// Abstract class can inherit Regular class only one
		// Abstract class inherit Interface by Implement keywords for more then one
		// Interface

	}
}
