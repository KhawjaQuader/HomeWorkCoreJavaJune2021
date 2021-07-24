package hw4Q3JavaVariablesConstructorAndMethod;

public class MyProfile {

	public String MyName;
	public int myAge;
	public char mySex;
	public boolean birthUsa;
	public byte serialNumber;
	public short idNumber;
	public long cellnumber;
	public float myGrade;
	public double myHeight;

	public MyProfile() {// constructor declared

	}

	public void myProfile() {// Method implemented
		System.out.println("My Name: " + MyName + "\t\t\tMy Age: " + myAge + "\t\tMy Sex: " + mySex + "\nMy Birth Place: "
				+ birthUsa + "\t\tMy Serial Number: " + serialNumber + "\tMy Id Number: " + idNumber + "\nMy Cell Number: "
				+ cellnumber + "\tMy Grade: " + myGrade + "\t\tMy Height: " + myHeight);

	}

	public static void main(String[] args) {
		MyProfile Boby = new MyProfile();//Initialize Default Constructor
		Boby.MyName = "Boby";
		Boby.myAge = 55;
		Boby.mySex = 'M';
		Boby.birthUsa = true;
		Boby.serialNumber = 100;
		Boby.idNumber = 3000;
		Boby.cellnumber = 3456789l;
		Boby.myGrade = 3.00f;
		Boby.myHeight = 5.923;

		Boby.myProfile();

		System.out.println("****************************************************************************");

		MyProfile favorite_person = new MyProfile();
		favorite_person.MyName = "Amaan";
		favorite_person.myAge = 45;
		favorite_person.mySex = 'M';
		favorite_person.birthUsa = true;
		favorite_person.serialNumber = 120;
		favorite_person.idNumber = 3001;
		favorite_person.cellnumber = 35469871;
		favorite_person.myGrade = 3.50f;
		favorite_person.myHeight = 6.123;

		favorite_person.myProfile();

	}
}
