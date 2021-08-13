package java_oop_exam;
/* Q 3
 * Assume AppleWatch is an abstract class
 * which has 2 method: One is abstractClassInfo 
 * [which is a non-abstract method, 
 * print out all the features of an abstract class compared with Interface, regular class].
 * what type of method would be the other one - name appleWatchInfo?
 * Can you create a constructor inside Abstract Class? ???
 * Create two interface names Watch, DigitalWatch.
 * And a regular class name AppleWatchSeries5. 
 * Can you make a relationship with AppleWatch, Watch, DigitalWatch, and AppleWatchSeries5? ???
 * [points: 70] 
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public void abstractClassInfo() {// Non Abstract Method
		System.out.println(
				" Abstract class \n Name starts with UpperCase. \n Methods implemented inside it. \n Methods declared inside it. \n An abstract class is a super class that cannot be instantiated. \n\t Applewatchinfo is Abstract method. \n\t Yes we can create constructor inside Abstract Class. ");
		System.out.println("*****************************************************************");
	}

	public abstract Void appleWatchInfo();// Abstract method

}
