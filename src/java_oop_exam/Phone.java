package java_oop_exam;

/* Q 2
 * * Create a package 'java_oop_exam' 
 * (The code needs to prepare according to the question): 
 * Phone is an interface that has 
 * four abstract method interfaceInfo, call, message, camera and 
 * 2 non-abstract method - battery and wireless which are implemented.
 * from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. 
 *
 * When you get a chance to implement interfaceInfo, 
 * print out answers for the following   questions:  
 *
 * What are the features of Interface you know?      
 * Can we create a constructor inside an interface?  
 * Can we write variables inside Interface?          
 * Don't copy-paste, write how much you can remember,
 * use newline (\n), tab(\t)], for other abstract methods which will be implemented,  
 * also print whatever you like. (later)
 * Do you think we can extends or implements Interface? Single or multiple? 
 * Create two interface Pager and Wakitaki 
 * (Phone interface inherit them) 
 * and One regular class name LandPhone
 * and one abstract class SatelitePhone.
 * make a relation of this 4, with Phone if possible. ???
 * [points: 70] .
 */
 /* Q 3
 * Assume AppleWatch is an abstract class 
 * which has 2 method: One is abstractClassInfo [which is a non-abstract method, 
 * print out all the features of an abstract class compared with Interface, regular class]. 
 * what type of method would be the other one - name appleWatchInfo? 
 * Can you create a constructor inside Abstract Class?
 * Create two interface names Watch, DigitalWatch.
 * And a regular class name AppleWatchSeries5. 
 * Can you make a relationship with AppleWatch, Watch, DigitalWatch, and AppleWatchSeries5?
 */
/* Q 4
 * Now think about a regular class Iphone1.
 * Create a method - regularClassInfo 
 * and print out all the features of a regular class compared with Interface and Abstract class you know. 
 * what is the relation between regular class, Abstract class and Interface? 
 * Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class.  
 * [Complete the code after answering above]. 
 * [points: 30] . 
 * Think about a class name TestPhone. 
 * Instantiate IPhone1, AppleWatch and Phone inside it. 
 * Call all the possible method by each of them. 
 * Go to next step after finishing till this. 
 * [points: 70] .
 */
public interface Phone extends Pager, Wakitaki {// Phone is an Interface

	public abstract void interfaceInfo();// Abstract method 1

	public abstract void call();// Abstract method 2

	public abstract void message();// Abstract method 3

	public abstract void camera();// Abstract method 4

	public default void battery() {
		System.out.println("*****************************************************************");
		System.out.println("Battery is a Default Non Abstract or Implemented method.");
		System.out.println("*****************************************************************");
	}
	

	public static void wireless() {
		System.out.println("wireless is a Static Non Abstract or Implemented method");
	}

	/*
	 * You cannot instantiate an interface. An interface does not contain any
	 * constructors. All of the methods in an interface are abstract. An interface
	 * cannot contain instance fields
	 * An interface is not extended by a class;
	 * it is implemented by a class
	 */

}
