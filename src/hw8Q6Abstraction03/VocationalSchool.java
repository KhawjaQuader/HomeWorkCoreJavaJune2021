package hw8Q6Abstraction03;

/*
 * Copy your previous package "hw7Q4Abstraction02"  * and paste as a new package and rename it to "hw8Q6Abstraction03" inside your HW project and execute the remaining. Read the question very carefully.
 *  Create interface VocationalSchool and a method vocationalInfo inside it. 
 *  Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. See the below inheritance. 
 *  University extends College , Hospital. 
 *  
 *  ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool???.   
 *  
 *  MedicalSchool extends NursingSchool.???
 *  
 *  NursingSchool extends RockefellerUniversity.???
 *  
 *  RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool.??? 
 *  
 *  EngineeringSchool extends NYUniversity.
 *  
 *  Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.
 *     
 *  Paste the github link below.
 */ 
 // Create interface VocationalSchool and a method vocationalInfo inside it.
 
public interface VocationalSchool {

	public void vocationalInfo();

}
