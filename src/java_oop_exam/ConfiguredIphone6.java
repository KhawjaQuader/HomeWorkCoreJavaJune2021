package java_oop_exam;
/*
 * Now think about a regular class Name ConfiguredIphone6
 * Which extends Iphone6.
 * Override those methods and change the logic at your own to show the changes.
 * [points: 50].
 * Show the output in TestPhone. 
 * [points: 50]. 
 * Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance.
 * [points: 50].
 */
public class ConfiguredIphone6 extends Iphone6 {
    @Override
	public void compass() {
		System.out.println("compass is void type method from Iphone6 Class");
	}
    //Logic change done below
    @Override
	public void materials() {// Void method
		System.out.println("Method overriding done in ConfiguredIphone Class");
    	System.out.println("This is void type method from Iphone6 Class");
	}
    @Override
	public void materials(int ramPrice, int cameraPrice) {// parameterized method
		int total = ramPrice + cameraPrice + 10;
		System.out.println("Parameterized method Total price is: " + total);
	}

	@Override
	public int materials(int ramPrice, int cameraPrice,String ProcessorPrice) {// Parameterized return type
		int total = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) - 10;
		System.out.println("Return type Parameterized method Total Price is:" + total);
		return total;
	}
	// As it is own static method of it own class Override is not required
	public static int materials(int ramPrice, int cameraPrice,int phonePrice,int headPhonePrice) {// Static type method
		int total = ramPrice + cameraPrice + phonePrice + headPhonePrice * 2;
		System.out.println("Static method Total Price is:" + total);
		return total;
        
			}
	
/*  Final type method can not be override from Iphone6 
	public final int materials(int ramPrice, int cameraPrice,int phonePrice,int headPhonePrice,int dataPrice) {// Final type
		int total = ramPrice + cameraPrice + phonePrice + headPhonePrice + dataPrice;
		System.out.println("Final method Total price is:" + total);
		return total;
	*/
}

