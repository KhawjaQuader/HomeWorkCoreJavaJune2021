package hw5Q5Constructor;

/* 1 Package created at top
 * 1 Create a package name "hw5Q5Constructor" in your HW project. Inside the package,
 * 2 Create a class "Student".
 * 3 Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float).
 * 4 Declare default constructor and one parameterized constructors. Use only one System.out.println() in each constructor to declare the above variables.
 * 5  Also, create a parameterized method with all the variables. 
 * 
 * 6 Create another class TestStudent.
 * 7 Create object as many as you want under the main method.
 * 8 Initialize constructors.
 * 9 I want the first outcome in the console as --> This is from default Constructor of Student class. 
 * 10 The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer: true.
 * 11 Also, initialize the parameterized method.
 * 12 Push in the github. Paste your github link below.13 (Please paste the whole question inside the multiple line comments between package and class)  
 */
public class Student {// 2 Class name student created

	public String StName;// 3 variables declared
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;

	public Student() {// 4 Default constructor declared
		System.out.println("This is a default Constructor from Student Class");

	}

	public Student(String StName, int stid, char sex, float grade, boolean programmer) {
		this.StName = StName;
		this.stID = stid;
		this.sex = sex;
		this.grade = grade;
		this.programmer = programmer;

		System.out.println("Student Name: " + StName + ", ID: " + stid + ", Sex: " + sex + ", Grade: " + grade
				+ " and Java Programmer: " + programmer);

	}

	public void student(String StName, int stid, char sex, float grade) {
		System.out.println("Student Name: " + StName + ", ID: " + stid + ", Sex: " + sex + ", Grade: " + grade);

	}

}
