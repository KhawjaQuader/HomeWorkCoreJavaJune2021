package hw7Q4Abstraction02;

import hw6Q4Abstraction01.RockefellerUniversity;

/*iv) Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? 
 */
public class NYUniversity extends RockefellerUniversity {

	public void physics() {
		System.out.println("This is Physics Method");
	}

	public NYUniversity() {
		// Default Constructor inside a regular Class created
		// Abstract method can not possible to create
	}

}
