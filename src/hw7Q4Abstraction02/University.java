package hw7Q4Abstraction02;

/*
 * (Paste the question between package and class by multiple line comment).
 * (From HW 06) Copy your previous package "hw6Q4Abstraction01" and rename it to "hw7Q4Abstraction02" 
 *
 * inside your HW project and execute the remaining. Read the question very carefully. 
 * 
 * i) Create one default and one static method gymnasium and library inside interface "University". 
 * Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 * Create also one default and one static method dorm and studyRoom inside interface "College". 
 * How many keywords are used for the inheritance in Java? 
 * How many keywords are used for the inheritance in Interface, answer by Java comments? 
 * if you can use the keyword 'implements' in Interface, please use it. Use all the interfaces -- University, Hospital, and College to answer my questions. 
 *__________________________________________________________________________________
 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. 
 * How many keywords are used for the inheritance in Java for Abstract Class?
 * Can an Abstract Class inherit other Abstract Class or a regular class or interface? 
 * How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes and use the keywords to answer my questions. 
 * _________________________________________________________________________________
 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity.
 * How many keywords are used for the inheritance in Java for a regular Class? 
 * Can an regular Class inherit other Abstract Class or a regular class or interface? 
 * How many inheritances is possible by a regular Class? Use the all of above regular Classes and use the keywords to answer my questions.
   _________________________________________________________________________________
 * You don't need to execute anything as the main method is absent.
 * Paste your Abstraction github link below
 * 
 *++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *
 *i) Create one default and one static method gymnasium and library inside interface "University". 
 *
 *  How many keywords are used for the inheritance in Java?
 *  How many keywords are used for the inheritance in Interface, answer by Java comments? if you can use the keyword 'implements' in Interface, please use it. 
 *  Use all the interfaces -- University, Hospital, and College to answer my questions
 */
public interface University extends Hospital,College {// implements Hospital,College{can not work

	public void classSize();

	public void field();

	public void teacher();

	public default void gymnasium() {
		System.out.println("This is a default method from University interface");
	}

	public static void library() {
		System.out.println("This is a static method from University interface");
	}

	// Ans i(Interface)
	// 02 keywords used for the inheritance in Java
	// 01 keywords used for the inheritance in Interface
	// We can not use implements keyword in Inheritance interface
	// Interface only Inherit Interface by extends keyword more then 1

	// Ans ii(Abstract)
	// 2 keywords used for the inheritance in Java for Abstract Class
	// Abstract Class can inherit 1 Abstract Class or 1 regular by extends keyword 
	// Abstract class can inherit interface by implements keyword more then 1 
	// One for Abstract or regular class More then one for interface

	// Ans iii(Regular)
	// 02 keywords used for the inheritance in Java for Regular Class
	// Regular Class inherit 1 Regular Class or 1 Abstract class by extends keyword
	// Regular class can inherit Interface by Implement keyword more then 1
    
	
}
