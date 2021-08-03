package hw6Q4Abstraction01;

/*
 * (Paste the complete question between package and class by multiple line comments.) Create a package name "hw6Q4Abstraction01" inside your HW project. Inside the package, 
 * 
 * a) Create an interface "University". 
 * Declare some methods inside the interface named--> classSize, field, and teacher. 
 * 
 * b) Create another interface "Hospital".
 *  Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. 
 * 
 * c) Create another interface "College".
 *  Declare some methods inside the interface - commonRoom, laboratory, languageClub.
 * 
 * d) Create an Abstract Class MedicalSchool, 
 * create 2 methods inside the Abstract Class 
 * One is abstract and another one is non abstract 
 * Name -- anatomyLab and biochemistryLab.
 * Print something inside the non abstract or implemented method. 
 *  
 * e) Create another Abstract Class EngineeringSchool, 
 * Create 2 methods inside the Abstract Class
 * One is abstract and another one is non abstract
 * Name -- mechanicalLab and computerLab. 
 * Print something inside the non abstract or implemented method .
 *  
 * Now,
 *  i) Can you create a Constructor inside the interface? If yes, 
 * create default Constructor on each interface. 
 * If no, comment out the 'created constructor' and answer why not? 
 * Now, answer
 * How many keywords are used for the inheritance for Interface? 
 * Can an interface inherit other Interface, or a regular class or abstract class? 
 * How many inheritance is possible? Use the Interface -- "University" to answer my questions. 
 * 
 * ii) You have 2 abstract class name --MedicalSchool, EngineeringSchool already.
 *  Create another Abstract Class NursingSchool, 
 * create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. 
 * Print something inside the non-abstract or implemented method.
 * Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? 
 * Now, answer 
 * How many keywords are used for the inheritance of Abstract Class? 
 * Can an Abstract Class inherit other Abstract Class or a regular class or interface?    
 * How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.
 *
 * iii) Create a regular Class ColumbiaUniversity, 
 * create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. 
 * if any of them is not possible to create, simply comment out the method and explain why in comment out.
 * Print something inside the non-abstract or implemented method. 
 * Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 *
 * iv) Create a regular Class NYUniversity, 
 * create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out.
 * Print something inside the non-abstract or implemented method. 
 * Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? 
 *    
 * v) Create a regular Class RockefellerUniversity, 
 * create 2 methods inside the class - one is abstract and another one is the non-abstract 
 * name -- maths and statistics. if not possible to create, 
 * simply comment out the method and explain why in comment out.
 * Print something inside the non-abstract or implemented method. 
 * Can you create a Constructor inside a regular Class? 
 * If yes, create default Constructor. If no, comment out the created constructor and answer why not?
 *  
 * Now, answer 
 * How many keywords are used for the inheritance for a regular Class? 
 * Can a regular Class inherit other Abstract Class or regular class or interface?
 * How many inheritances is possible by a regular Class?
 
 * Use the above regular Classes to answer my questions. 
 *    
 * You don't need to execute anything as the main method is absent.
 *    
 * Organize the code. Push the code in Github. Paste your github link below.
 * 
 * ===================================================================================
 *aa)Create an interface "University". Declare some methods inside the interface named--> classSize, field, and teacher. 
 *
 *Now, i) Can you create a Constructor inside the interface? If yes, 
 * create default Constructor on each interface. If no, comment out the 'created constructor' and answer why not? 
 * Now, answer 
 * How many keywords are used for the inheritance for Interface? 
 * Can an interface inherit other Interface, or a regular class or abstract class? 
 * How many inheritance is possible? Use the Interface -- "University" to answer my questions.
 */
public interface University extends Hospital,College{
	
	//public University();Left side is sample of default constructor but we can not use in interface
	
	public void classSize();//In interface we can only declare Method
                           
	public void field();

	public void teacher();

	// Ans i
	// Interface can not have constructor as it can not instantiate 
	// Interface can Inherit more then One Interface only by Extend key word 
	// Interface can inherit other Interface
	// Interface can not inherit Abstract or Regular Class
	// More then one inheritance is possible in Interface by extends keyword
	
	//Ans ii
	//02 keywords used for the inheritance of the Abstract class
	//Abstract class can inherit 1 Abstract or 1 Regular class by extends keyword
	//Abstract class can inherit interface by only implements keyword
	
	//Abstract = MedicalSchool,EngineeringSchool,NursingSchool, 
	//Interface = University,Hospital,College
	//MedicalSchool extends EngineeringSchool
	//EngineeringSchool extends NursingSchool
	//NursingSchool Inherit University,hospital and College by Implement keyword
	//Abstract class can not be Instantiated
	
	//Ans iii,iV & v
	//Regular class for ColumbiaUniversity,NYUniversity and RockefellerUniversity done
	//2 keyword used for the inheritance for the regular class
	//Regular class can inherit 1 Regular or 1 Abstract class by extends keyword
	//Regular class can inherit Interface by Implements keyword more then 1
	
	//Regular = ColumbiaUniversity,NYUniversity & RockefellerUniversity 

}
