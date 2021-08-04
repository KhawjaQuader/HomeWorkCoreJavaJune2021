package hw9Q3Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.ageofSister();//Void type
		sister.ageofSister(10, 20);//Parameterized
		sister.ageOfSisters(10, 20, 30);//Return Parameterized type
		sister.ageOfSisters(10, 20, 30, 40, "50");//Return Parameterized type with string
		Sister.ageOfSisters(1, 2, 3, 4, 5);//Static type
		sister.ageOfSisters(10, 20, 30, 40, 50, 80);//Final type 

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++=++++");
		
		Niece niece = new Niece();
		niece.ageofSister();
		niece.ageofSister(1, 2);
		niece.ageOfSisters(3, 4, 5);
		niece.ageOfSisters(11, 12, 13, 14, "15");
		Niece.ageOfSisters(4, 5, 6, 7, 8);
		
		
	}
	
	}
	
	


