package hw5Q4Constructor;

/*
 * 7 Create another class TestComputer. 8 Create object as many as you want under main method?.9 initialize all the constructors?. I want in console, the first  (a) outcome as --> This is from default Constructor of Computer class. Second (b) outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third (c) outcome in console for your configuration. Fourth (d) outcome for 1 variable, 5th (e) outcome for 3 variable, (f) 6th outcome for 5 variable. Organize your code. 10 Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 */
public class TestComputer {// 7 Another class created

	public static void main(String[] args) {// 8 This is main method
		
		Computer computer = new Computer();
		Computer computer2 = new Computer("Apple", "MacBook" , "MacOS Mojave " ,800,'C',false);
		Computer computer3 = new Computer("Dell","Latitude","E7440",500,false,'B');
		Computer computer4 = new Computer("Lenovo");
		Computer computer5 = new Computer("Hp",600,'A');
		Computer computer6 = new Computer("Sony","A123","Windows",700,'B');
		
				

		

		
	}

}
