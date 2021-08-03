package hw8Q6Abstraction03;

/*
 * Copy your previous package "hw7Q4Abstraction02" and paste as a new package and rename it to "hw8Q6Abstraction03"
 * 
 *  inside your HW project and execute the remaining. Read the question very carefully. 
 *  
 *  Create interface VocationalSchool and a method vocationalInfo inside it.
 *  Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. 
 *  See the below inheritance. 
 *  University extends College, Hospital. 
 *  ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. 
 *  MedicalSchool extends NursingSchool.
 *  NursingSchool extends RockefellerUniversity. 
 *  RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool.
 *  EngineeringSchool extends NYUniversity. 
 *      
 *  Follow all the above hierarchy to inherit the methods.
 *  
 *  Now create a class TestInstitute.
 *  Then Instantiate
 *   ColumbiaUniversity , 
 *   RockefellerUniversity, 
 *   University, Hospital, 
 *   MedicalSchool 
 *   and NursingSchool one by one. 
 *   
 *   Call all the possible methods from
 *   ColumbiaUniversity ,
 *   RockefellerUniversity,
 *   University, 
 *   Hospital, 
 *   MedicalSchool 
 *   and NursingSchool. 
 *   
 *   Paste the github link below.
 */
public interface University extends College,Hospital {//Here all are interface

	public void classSize();

	public void field();

	public void teacher();

	public default void gymnasium() {
		System.out.println("This is a default method from University interface");
	}

	public static void library() {
		System.out.println("This is a static method from University interface");
	}

	// Ans i
	// 02 keywords used inheritance in Java
	// 01 keywords used for the inheritance in Interface
	// We can not use implements keyword in Inheritance interface

	// Ans ii
	// Only one extend keywords used for the inheritance in Java for Abstract Class
	// Abstract Class inherit other Abstract Class or a regular only once
	// implements keyword use to inherit interface in Abstract class
	// One for Abstract or regular class More then one for interface

	// Only one extend keywords used for the inheritance in Java for Regular Class
	// regular Class inherit other Abstract Class or a regular class or interface
	// One for Abstract or regular class More then one for interface
    // This is test line
	
}
