package hw5Q5Constructor;

/* 6 Create another class TestStudent.
 * 7 Create object as many as you want under the main method.
 * 8 Initialize constructors.
 * 9 I want the first outcome in the console as --> This is from default Constructor of Student class. 
 * 10 The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true.
 * 11 Also, initialize the parameterized method.
 * 12 Push in the github. Paste your github link below.13 (Please paste the whole question inside the multiple line comments between package and class)  
 */

public class TestStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		Student student2 = new Student("Boby", 12345, 'M', 3.976f, true);
		Student student3 = new Student();
		student3.StName = "Alex";
		student3.stID = 787;
		student3.sex = 'M';
		student3.grade = 3.977f;

		student3.student("Alex", 787, 'M', 3.977f);

	}

}
