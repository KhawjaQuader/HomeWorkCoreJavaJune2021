package java_oop_exam;

/* Q  08)
 * Now, Think about Iphone6. 
 * It also has 5 methods with the same name as materials().
 * For example -- They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice), etc. 
 * Can you use the void, parameterized, final, or static method here as the same method name? 
 * if yes, create them and take more int variable of your own.
 * What kind of concept you can use? 
 * [points: 70].
 * Instantiate the class in TestPhone and initialize those methods.
 * [points: 70]. 
 *      
 * Now think about a regular class Name ConfiguredIphone6
 * Which extends Iphone6.
 * Override those methods and change the logic at your own to show the changes.
 * [points: 50].
 * Show the output in TestPhone. 
 * [points: 50]. 
 * Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance.
 *  [points: 50].
 */
public class Iphone6 extends Iphone5 {
	// Method Implemented
	public void compass() {
		System.out.println("compass is void type method from Iphone6 Class");
	}

	// Method Implemented
	public void materials() {// Void method
		System.out.println("*********Method overloading done in Iphone6 Class****************");
		System.out.println("This is void type method from Iphone6 Class");
	}

	// Method Implemented
	public void materials(int ramPrice, int cameraPrice) {// parameterized void type method can not have return value
		int total = ramPrice + cameraPrice;
		System.out.println("Parameterized method The price is: " + total);

	}

	// Method Implemented
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {// Parameterized return type
		int total = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);// One signature is String type
		System.out.println("Return type Parameterized method Total Price is:" + total);
		return total;// return type
	}

	// Method Implemented
	public static int materials(int ramPrice, int cameraPrice, int phonePrice, int headPhonePrice) {// Static type
																									// method
		int total = ramPrice + cameraPrice + phonePrice + headPhonePrice;
		System.out.println("Static method Total Price is:" + total);
		return total;// Return type

	}

	// Method Implemented
	public final int materials(int ramPrice, int cameraPrice, int phonePrice, int headPhonePrice, int dataPrice) {// Final
																													// type
		int total = ramPrice + cameraPrice + phonePrice + headPhonePrice + dataPrice;
		System.out.println("Final method Total price is:" + total);// Return type
		return total;// Return type

	}

}
