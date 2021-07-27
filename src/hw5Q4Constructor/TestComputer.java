package hw5Q4Constructor;

/* 6 Create another class TestComputer.
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
public class TestComputer {// Another class created

	public static void main(String[] args) {// This is main method

		Computer computer = new Computer();
		Computer computer2 = new Computer("Apple", "MacBook", "MacOS Mojave ", 800, 'C', false);
		Computer computer3 = new Computer("Dell", "Latitude", "E7440", 500, false, 'B');
		Computer computer4 = new Computer("Lenovo");
		Computer computer5 = new Computer("Hp", 600, 'A');
		Computer computer6 = new Computer("Sony", "A123", "Windows", 700, 'B');

	}

}
