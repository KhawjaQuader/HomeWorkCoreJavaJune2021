package java_oop_exam;
/*
 * Q 06)
 * NOW, Iphone1 came in 2000,
 * but the new model Iphone2, Iphone3 came in 2001.
 * Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1.
 * in 2002, Iphone4 come into the market which inherits Iphone2. in 2003, 
 * Iphone5 come into the market which inherits Iphone4. In 2004,
 * Iphone6 come into the market which inherits Iphone5. 
 * Consider all of them as a regular class and write a method inside them related to one of the features like ---- 
 * map (use in Iphone3 and print out "Map is introduce in Iphone3.The price is increased to 780$"),
 * youtube, i1
 * dropbox, i2
 * photos,  i4
 * email,   i5
 * compass, i6
 *  etc 
 * (6 methods for 6 class). 
 * What kind of concept you can use to relate to them? 
 * Instantiate Iphone6 and show how many methods they can call in TestPhone. [points: 70] .

 */
/* Q 07) 
 * Again, from Iphone1, 
 * we got 4 private variables we know. 
 * Create 2 constructors inside it using that 4 private variables
 *  -- default and parameterized after those variables. 
 *  
 * In IPhone2,
 * declare a char variable userOfIphone2 (M or F). 
 * create default and parameterized constructor,
 * a void type method iPhone2Info, 
 * a parameterized method with same name iPhone2Info inside Iphone2 class.
 * Use the super method and super keyword in constructor, 
 * and super keyword in methods of Iphone2.
 * Call constructor and methods. 
 * Can you call variable by super keyword? 
 * create a public variable inside Iphone1 and execute it in Iphone2. 
 * Execute all of them in TestPhone. 
 * [points: 70]
 */
public class IPhone2 extends Iphone1{
	
	public char userOfIphone2;
	
	public IPhone2() {//Default constructor 
	super();
	super.regularClassInfo();//
	super.Name = "Abc";
	System.out.println("*********************************************************************");
	System.out.println("Name: " + Name);
	System.out.println("This is default constructor from Iphone2 Class ");
	}
	
	public IPhone2(char userOfIphone2){//Parameterized constructor
	super();
	super.regularClassInfo();
	super.Name = "Abc";
	System.out.println("Name: " + Name);
	this.userOfIphone2 = userOfIphone2;
	System.out.println("userOfIphone2: " +  userOfIphone2);	
	}
	public void iphone2Info() {//Void type method
		super.regularClassInfo();
		super.Name = "Abc";
		System.out.println("Family Name: "+ Name);
	
	}
	
	public void dropbox() {
		}
}
