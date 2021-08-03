package hw6Q4Abstraction01;

/*d) Create an Abstract Class MedicalSchool,
 *create 2 methods inside the Abstract Class - 
 *one is abstract and another one is non abstract 
 *name anatomyLab and biochemistryLab. 
 *Print something inside the non abstract or implemented method
 */
public abstract class MedicalSchool extends EngineeringSchool {//Abstract class created

	public abstract void anatomyLab();//Abstract Method created
                                      //Method Declared
	                                  //Abstract keyword must be in Abstract Method
	
	public void biochemistryLab() {//Non Abstract or Void Method Implemented
		System.out.println("The method is implemented");
	}	
	public MedicalSchool() {// Constructor inside Abstract Class

	}

}
