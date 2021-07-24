package hw7Q4Abstraction02;
/*
 *  v) Create a regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 *  
 *   Now, answer how many keywords are used for the inheritance for a regular Class? Can a regular Class inherit other Abstract Class or regular class or interface? How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions. You don't need to execute anything as the main method is absent. Organize the code. Push the code in Github. Paste your github link below.
 */

public class RockefellerUniversity extends ColumbiaUniversity implements College, University {

	public void statistics() {
		System.out.println("The name of the method is Statistic");
	}

	public RockefellerUniversity() {
		// Default Constructor inside a regular Class created
		// Abstract method can not possible to create

	}

	@Override
	public void commonRoom() {
		System.out.println("Common Room method");

	}

	@Override
	public void laboratory() {
		System.out.println("Laboratory method");

	}

	@Override
	public void languageClub() {
		System.out.println("Language Club method");

	}

	@Override
	public void classSize() {
		System.out.println("Class Size method");
	}

	@Override
	public void field() {
		System.out.println("Field method");

	}

	@Override
	public void teacher() {
		System.out.println("Teacher method");

	}
}
