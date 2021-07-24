package hw5Q3variableAndMethod;

/*
  6 Create another class TestComputer. 7 Create object from Computer class under main method. 8 Initialize object and configuration method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class
 */

public class TestComputer {// 6 TestComputer class created as another

	public static void main(String[] args) {// This is main method
		Computer computer = new Computer();// Blue is Computer class,Yellow is Object/Ref variable
		computer.Brand = "Apple";
		computer.Model = "MacBook Air";
		computer.OperatingSystem = "MacOS Mojave";
		computer.price = 800;
		computer.madeinUSA = false;
		computer.grade = 'A';

		computer.configuration();

		System.out.println("********************************************************************");

		Computer computer_b = new Computer();
		computer_b.Brand = "Apple 2";
		computer_b.Model = "MacBook Air 2";
		computer_b.OperatingSystem = "MacOS Mojave 2";
		computer_b.price = 700;
		computer_b.madeinUSA = false;
		computer_b.grade = 'B';

		computer_b.configuration();
	}

}
