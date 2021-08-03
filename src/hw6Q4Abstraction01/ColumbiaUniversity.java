package hw6Q4Abstraction01;

/* iii) Create a regular Class ColumbiaUniversity, 
 * create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. 
 * if any of them is not possible to create, simply comment out the method and explain why in comment out.
 *  Print something inside the non-abstract or implemented method. 
 *  Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 */
public class ColumbiaUniversity extends NYUniversity implements University,Hospital,College{
	
	//public abstract void chemistry();Left side Abstract method declared in nature
			//and In regular class we can not Declare methods
	
	public void biology() {//Non Abstract method or Void method Implemented
		System.out.println("This is Biology Method ");
	}

	public ColumbiaUniversity() {
		
		
		// Default Constructor inside a regular Class created
		// Abstract method can not possible to create

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void field() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

}
