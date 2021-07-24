package hw5Q3variableAndMethod;

/* 1 Create a package name "hw5Q3variableAndMethod" in your HW project.Inside the package, 2 Create a class "Computer". 3 Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). 4 Implement a method inside the class -- "configuration" and use 5 only one System.out.println(). Use the variables inside sysout. 
 
  6 Create another class TestComputer. 7 Create object from Computer class under main method. Initialize object and configuration method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */
// 1 Package name created at the top
public class Computer {// 2 Here left side of curly braces class name computer created
	// 3 below some variables are declared
	public String Brand;
	public String Model;
	public String OperatingSystem;
	public int price;
	public boolean madeinUSA;
	public char grade;

	// public Computer() {//constructor declared the default one?????

	// }

	public void configuration() {// 4 method implemented name as configuration
		// 5 below use only one sysoutprintln and variables are use inside sysout below
		System.out.println("My Brand: " + Brand + ", Model: " + Model + ", Operating system: " +  OperatingSystem + ", Price: " + price + "$ and Made in USA?: " + madeinUSA + ", grade: " + grade );
	}

}
