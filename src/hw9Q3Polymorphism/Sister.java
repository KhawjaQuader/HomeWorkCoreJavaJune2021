package hw9Q3Polymorphism;

/*
 *  Create a package "hw9Q3Polymorphism"  *  inside your HW project and execute the remaining.
 *  Read the question very carefully. 
 *  Create a class Sister. 
 *  Can you create several methods with the same name inside it? 
 *  Give the method name ageOfSisters. As a variable, use int age1, int age2, int age3, String age4, int age5, int age6 etc in different combination. 
 *  Use 1 void type,2 parameterized type,3/4 return type,5 static type,6 final type method by different combinations of the above variable. 
 *  Tell me what is the Method overloading. 
 *  initialize all the methods in TestFamily class. 
 *  Create another class Niece and inherit Sister.
 *  Override all the possible methods by changing logic. 
 *  If some methods are not possible to override, please explain why by comments. 
 *  Initialize all the methods in TestFamily class.
 */

public class Sister {

	public void ageofSister() {// Void method
		System.out.println("This is void type method from Sister Class");
	}

	public void ageofSister(int age1, int age2) {// parameterized method
		int total = age1 + age2;
		System.out.println("This Parameterized type method from Sister class ");
	    
	}

	public int ageOfSisters(int age1, int age2, int age3) {// Parameterized return type
		int total = age1 + age2 + age3;
		System.out.println("Total Age:" + total);
		return total;
	}

	public int ageOfSisters(int age1, int age2, int age3, int age4,String Sis ) {// Parameterized return type
		int total = age1 + age2 + age3 + age4 + Integer.parseInt(Sis);
		System.out.println("Total Age:" + total);
		return total;
	}

	public static int ageOfSisters(int age1, int age2, int age3, int age4,int age5) {// Static type method
		int total = age1 + age2 + age3 + age4 + age5;
		System.out.println("This Static method Age is:" + total);
		return total;

	}

	public final int ageOfSisters(int age1, int age2, int age3, int age4, int age5, int age6) {// Final type
		int total = age1 + age2 + age3 + age4 + age5 + age6;
		System.out.println("This is Final type method:" + total);
		return total;
	}
	/*Ans
	 * Method overloading is a feature of Java in which a class has more than one method of the same name and their parameters are different.
	 *Sister class methods initialized in Test Family class
	 */
	

}