package hw7Q4Abstraction02;
/*
 *  (Paste the question between package and class by multiple line comment). (From HW 06) Copy your previous package "hw6Q4Abstraction01" and rename it to "hw7Q4Abstraction02" inside your HW project and execute the remaining. Read the question very carefully.
 *  
 *i) Create one default and one static method gymnasium and library inside interface "University". 
 *
 *Create one default and one static method morgue and pharmacy inside interface "Hospital".
 *
 * Create also one default and one static method dorm and studyRoom inside interface "College".
 * 
 *  How many keywords are used for the inheritance in Java? how many keywords are used for the inheritance in Interface, answer by Java comments? if you can use the keyword 'implements' in Interface, please use it. Use all the interfaces -- University, Hospital, and College to answer my questions.
 *
 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes and use the keywords to answer my questions. 
 * 
 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class? Can an regular Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by a regular Class? Use the all of above regular Classes and use the keywords to answer my questions. You don't need to execute anything as the main method is absent. Paste your Abstraction github link below
 */

//*i) Create one default and one static method gymnasium and library inside interface "University". 
public interface University {

	public void classSize();

	public void field();

	public void teacher();
	
	public void gymnasium();
		
	
	public static void library(String []args) {
		
	}
		
	

	// interface can not have constructor
	// inheritance for Interface One key word used
	// Interface can inherit other Interface
	// Interface can not inherit Abstract or Regular Class
	// More then one inheritance is possible in Interface
	// I have 3 Abstract class 1.MedicalSchool, 2.EngineeringSchool 3.NursingSchool

}
