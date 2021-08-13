package java_oop_exam;

/*
 * Q 4
 * Now think about a regular class Iphone1.
 * Create a method - regularClassInfo 
 * and print out all the features of a regular class compared with Interface and Abstract class you know. 
 * what is the relation between regular class, Abstract class and Interface?
 * Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. ??? 
 * [Complete the code after answering above]. 
 * [points: 30] . 
 * 
 * Think about a class name TestPhone. 
 * Instantiate IPhone1, AppleWatch and Phone inside it. 
 * Call all the possible method by each of them. 
 * Go to next step after finishing till this. 
 * [points: 70] .
 */
/*
 * 05) Assume 4 private variables --
 *  price (as int), 
 * Info (as String, write few words when you bought it), 
 * user (as a char, M or F),
 * madeInUSA (as boolean) inside Iphone1 class. 
 * If the variables are private how can you use those variable?
 * What kind of concept you can use? 
 * use it just after the variables. 
 * Now print out in TestPhone: "I bought this phone in 2000, 
 * the price was 750$, 
 * user's sex: <put your sex initial> 
 * and boolean value for made in USA is: false". [points: 70] .
 */
public class Iphone1 extends AppleWatch implements Phone {// Concrete class

	private String purchase;
	private int price;
	private char sex;
	private boolean madeInUSA;
	public String Name;

	public Iphone1() {// Default constructor
	}

	public Iphone1(String purchase, int price, char sex, boolean madeInUSA) {// Parameterized Constructor
		this.purchase = purchase;
		this.price = price;
		this.sex = sex;
		this.madeInUSA = madeInUSA;
		System.out.println(
				" Purchase: " + purchase + ", price: " + price + ", Sex: " + sex + ", Made in USA: " + madeInUSA);

	}

	public String getPurchase() {
		return purchase;
	}

	public void youtube() {
	}

	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public void regularClassInfo() {// This is a Regular void type method from Iphone1 class

		System.out.println("****************************************************************");
		System.out.println(
				" Regular Class \n Extends key word is used to inherit either a Regular class or an abstract class. \n Implements keyword is used to inherit Interface. \n Multiple Interface is inherited by Implements keyword. \n Contain only implemented method. \n Regular class can inherit 1 Abstract class by Extends keyword. \n Can inherit Interface by Implements keyword more then 1.  ");
		System.out.println("****************************************************************");

	}

	@Override
	public void interfaceInfo() {
		System.out.println(
				" Interface \n Methods might contain abstract keyword or not.\n Interface is a Blueprint of Class. \n Generally Methods declared inside it. \n Name starts with UpperCase. \n\t We can not create constructor inside interface. \n\t We can not write variables inside interface .");

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public Void appleWatchInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
