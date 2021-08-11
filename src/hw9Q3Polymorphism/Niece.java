package hw9Q3Polymorphism;

public class Niece extends Sister {
    @Override
	public void ageofSister() {// Void method
		System.out.println("This is void type method from Sister Class");
	}
     @Override
	public void ageofSister(int age1, int age2) {// parameterized method
		int total = age1 + age2 + 5;
		System.out.println("This Parameterized type method from Sister class ");
	}
    @Override
	public int ageOfSisters(int age1, int age2, int age3) {// Parameterized return type
		int total = age1 + age2 + age3 + 6;
		System.out.println("Total Age:" + total);
		return total;
	}
    @Override
	public int ageOfSisters(int age1, int age2, int age3, int age4,String Sis ) {// Parameterized return type
		int total = age1 + age2 + age3 + age4 + Integer.parseInt(Sis) -7;
		System.out.println("Total Age:" + total);
		return total;
	}
 // As it is own Static method of Niece class Override is not required
	public static int ageOfSisters(int age1, int age2, int age3, int age4,int age5) {// Static type method
		int total = age1 + age2 + age3 + age4 + age5+ 8;
		System.out.println("This Static method Age is:" + total);
		return total;

	}
/*  Final type method can not be override
 * 	public final int ageOfSisters(int age1, int age2, int age3, int age4, int age5, int age6) {// Final type
 * int total = age1 + age2 + age3 + age4 + age5 + age6;
 * 	System.out.println("This is Final type method:" + total);
 * return total;
 * }
*/		
	
}
