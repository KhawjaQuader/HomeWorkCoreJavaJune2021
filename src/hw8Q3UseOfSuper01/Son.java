 package hw8Q3UseOfSuper01;
/*
 * b) Create a class name Son, 
 * declare variable Id, grade.
 * Declare default constructor 
 * and parameterized constructor, 
 * and implement a regular method son and declare a sysout.
 * Create a parameterized method sonInfo() which contains 2 of its variables.
 * Son extends Father (super class). 
 * Use super method, super keyword and show all of their use in child class.
 */
public class Son extends Father {
	
	public int id;
	public double grade;
	
	public Son() {//Default Constructor
		super();
		super.father();//Regular void method
		super.fatherInfo("Apple",25 ,'M',true);//Parameterized method
		super.FamilyName ="Royal";
		System.out.println("Family Name: "+ FamilyName);
		System.out.println("This is Default Constructor of Son Class");
	}

	public Son(int id, double grade) {//Parameterized Constructor
		super("Abc",50,'M',true);
		super.father();
		super.fatherInfo("Apple",25 ,'M',true);
		super.FamilyName ="Royal";
		System.out.println("Family Name: "+ FamilyName);
		this.id = id;
		this.grade = grade;
		System.out.println("ID: " + id +", Grade: "+ grade);
	}
	
	public void son() {//Regular void Method
		super.father();//Super Method can come under Method
		super.fatherInfo("Apple",25 ,'M',true);
		super.FamilyName ="Royal";
		System.out.println("Family Name: "+ FamilyName);
		System.out.println("This is a Regular void type method of Son Class");
	}
	public void sonInfo(int id, Double grade) {//Parameterized Method
		super.father();//Super Method can not come under Method
		super.fatherInfo("Apple",25 ,'M',true);
		super.FamilyName ="Royal";
		System.out.println("Family Name: "+ FamilyName);
		this.id = id;
		this.grade = grade;
		System.out.println("ID: " + id +", Grade: "+ grade);
	}
	
	
}
