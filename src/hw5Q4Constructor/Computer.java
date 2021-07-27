package hw5Q4Constructor;

/* 1 Create a package name "hw5Q4Constructor" in your HW project. 
 * 2 Inside the package,  Create a class "Computer". 
 * 3 Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). 
 * 4 Declare default constructor and  
 * 5 multiple parameterized constructor. Use only one System.out.println() in each constructor. 
 * 
 * 6 Create another class TestComputer.
 * 7 Create object as many as you want under main method?.
 * 8 initialize all the constructors?.
 * 9 I want in console, the first outcome as --> This is from default Constructor of Computer class. 
 * 10 Second  outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: and Made in USA? : false.
 * 11 I want the third outcome in console for your configuration.
 * 12 Fourth outcome for 1 variable, 
 * 13 5th outcome for 3 variable, 
 * 14 6th outcome for 5 variable.
 * 15  Organize your code. 
 * 16 Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */

public class Computer {// 2 Here left side of curly braces class name computer created
	// 3 below some variables are declared
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA;
	public char grade;

	public Computer() {// 4 default constructor declared
		System.out.println(" This is default constructor");// 1st outcome
	}

	public Computer(String Brand, String Model, String OperatingSystem, int price, char grade, boolean madeInUSA) {// 2nd
																													// outcome

		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println(" My Brand: " + Brand + ", Model : " + Model + ", Operating System: " + OperatingSystem
				+ ", Price: " + price + "$ and Made in USA?: ," + madeInUSA);
	}

	public Computer(String Brand, String Model, String OperatingSystem, int price, boolean madeInUSA, char grade) {// 3rd
																													// outcome
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;
		this.grade = grade;

		System.out.println(" Brand: " + Brand + ", Model: " + Model + ", Operating System: " + OperatingSystem
				+ ", Price: " + price + " and Made in USA?: " + madeInUSA + ", Grade: " + grade);

	}

	public Computer(String Brand) {// 4th outcome
		this.Brand = Brand;
		System.out.println(" Brand: " + Brand);

	}

	public Computer(String Brand, int price, char grade) {// 5th outcome
		this.Brand = Brand;
		this.price = price;
		this.grade = grade;
		System.out.println(" Brand: " + Brand + ", Price: " + price + ", Grade: " + grade);

	}

	public Computer(String Brand, String Model, String OperatingSystem, int price, char grade) {// 6th outcome
		this.Brand = Brand;
		this.Model = Model;
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		this.grade = grade;
		System.out.println(" Brand: " + Brand + ", Model: " + Model + ", Operating System: " + OperatingSystem
				+ ", Price: " + price + ", Grade: " + grade);

	}

}
