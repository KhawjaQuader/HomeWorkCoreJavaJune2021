package hw8Q3UseOfSuper01;

public class TestFamilyClass {
	
	public static void main(String[] args) {
		
		System.out.println("\n***********Father Class Default Constructor Initialized************");
		Father father = new Father();
		
		System.out.println("\n***********Father Class Parameterized Constructor Initialized********");
		Father father1 = new Father("Apple",25 ,'M',true);
		
		System.out.println("\n***********Father Class Viod Type Method Initialized********");
		father.father();
		
		System.out.println("\n***********Father Class Viod Type Parameterized Method Initialized********");
		father.fatherInfo("Apple",25 ,'M',true);
		
		System.out.println("\n***********Son Class Default Constructor Initialized************");
		Son son = new Son();
		
		System.out.println("\n***********Son Class Parameterized Constructor Initialized************");
		Son son1 = new Son(55,5.678);
		
		System.out.println("\n****************Son class void type method initialize");
		son.son();
		
		System.out.println("\n****************Son class void type method initialize");
		son.sonInfo(55,6.5);
		
		System.out.println("\n************Void type method inherit from father class*******");
		son.father();
		
		
		
		
		
		
		
		
		
	}
	

}
