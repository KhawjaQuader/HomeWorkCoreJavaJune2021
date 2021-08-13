package java_oop_exam;

/*
 * Think about a class name TestPhone. 
 * Instantiate IPhone1, AppleWatch and Phone inside it. 
 * Call all the possible method by each of them. 
 * Go to next step after finishing till this. 
 * [points: 70] .fd
 */
public class TestPhone {

	public static void main(String[] args) {

		Iphone1 iphone1 = new Iphone1();// Concrete class instantiated below all are instantiated
		iphone1.interfaceInfo();// Override method from Interface Phone
		iphone1.call();// Override method from Interface Phone
		iphone1.message();// Override method from Interface Phone
		iphone1.camera();// Override method from Interface Phone
		iphone1.battery();// Default Method from Interface Phone
		// Wireless is static method of Phone Interface can not be called
		iphone1.appleWatchInfo();// Abstract Method from AppleWatch Abstract class
		iphone1.abstractClassInfo();// Non Abstract Method from AppleWatch Abstract class
		iphone1.regularClassInfo();// Non Abstract Method from Iphone1 Regular class
		// Encapsulation Ans to question 5
		iphone1.setPurchase("I bought this phone in 2000");
		iphone1.setPrice(750);
		iphone1.setSex('M');
		iphone1.setMadeInUSA(false);
		System.out.println(" Ans to Question 5 below");
		System.out.println(" Purchase Year: " + iphone1.getPurchase() + ", \n Price: " + iphone1.getPrice()
				+ "$, \n Sex:" + iphone1.getSex() + ", Made in USA:" + iphone1.isMadeInUSA());
		System.out.println("\n**************************************************************");

		AppleWatch appleWatch = new Iphone1();// Abstract class need help of Concrete class
		appleWatch.appleWatchInfo();// Own method of AppleWatch
		appleWatch.abstractClassInfo();// Own method of AppleWatch

		Phone phone = new Iphone1();// Interface need help of Concrete class
		phone.interfaceInfo();// Interface own method
		phone.call();// Interface own method
		phone.message();// Interface own method
		phone.camera();// Interface own method
		phone.battery();// Default method
		Phone.wireless();// Static method need call by class
		// Ans to Question number 6
		System.out.println("\n**************************************************************");
		System.out.println("Ans to Question No 6 below");
		System.out.println("We will use Multilavel inheritance ");
		Iphone6 iphone6 = new Iphone6();
		iphone6.youtube();
		iphone6.dropbox();
		iphone6.photos();
		iphone6.email();
		iphone6.compass();
		Iphone3 iphone3 = new Iphone3();
		iphone3.map();
		System.out.println("\n**************************************************************");
		// Ans to Question number 7
		System.out.println("\n Ans to Question number 7 ");
		System.out.println("\n Default constructor already initialized at first at top");
		System.out.println("\n Iphone1 Parameterized constructor Initialiedd");
		Iphone1 iphonexr1 = new Iphone1("Purchase Year 2000", 100, 'M', false);

		System.out.println("\n**********RegularClassInfo void method Initialized************");
		iphone1.regularClassInfo();

		System.out.println("\n***********Default constructor of Iphone2 Initialized*********");
		IPhone2 iPhone2 = new IPhone2();

		System.out.println("\n********Parameterized constructor of Iphone2 Initialized******");
		IPhone2 iPhonexs1 = new IPhone2('M');

		System.out.println("\n****************Inherite from Iphone1*************************");
		iPhone2.regularClassInfo();

		System.out.println("\n****************Inherite from Iphone2*************************");
		iPhone2.iphone2Info();

		System.out.println("\n****************Inherite from Iphone2*************************");
		iPhone2.dropbox();
		// Ans to Question number 8

		System.out.println("\n Ans to Question number 8 ");

		iphone6.materials();// void type method
		iphone6.materials(10, 20);// Parameterized void type method instantiated
		iphone6.materials(30, 40, "50");// Parameterized return type method instantiated
		Iphone6.materials(55, 65, 75, 85);// Static return type method need to call by Class instantiated
		iphone6.materials(15, 25, 35, 45, 55);// Final return type method instantiated

		System.out.println("****************************************************************");

		ConfiguredIphone6 configuredIphone6 = new ConfiguredIphone6();
		configuredIphone6.materials();// void type method instantiated
		configuredIphone6.materials(11, 21);// Parameterized method void type instantiated
		configuredIphone6.materials(31, 41, "51");// Parameterized return type method instantiated
		ConfiguredIphone6.materials(61, 71, 81, 91);// Static return type method need to call by class instantiated

		// Q What kind of concept you can use? Ans Overriding and Overloading.

		// Comment out at the end of TestPhone to inform me which is hierarchical
		// inheritance, multilevel inheritance, and single inheritance.
		// Single Inheritance = ConfiguredIphone extends Iphone1
		// Hierarchical Inheritance = Iphone2 and Iphone3 extends Iphone1
		// Multilevel Inheritance = Iphone6 extends Iphone5 extends Iphone4 extends
		// Iphone2 extends Iphone1
		System.out.println("********************************************************************");
		System.out.println("Single Inheritance = ConfiguredIphone extends Iphone1");
		System.out.println("Hierarchical Inheritance = Iphone2 and Iphone3 extends Iphone1");
		System.out.println(
				"Multilevel Inheritance = Iphone6 extends Iphone5 extends Iphone4 extends Iphone2 extends Iphone1");
		System.out.println("*******************End of the Oop_Exam_HomeWork*********************");
	}

}
