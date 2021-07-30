package hw7Q3Encapsulation01;
/*
 * (paste the question between package and class by multiple line comment). 
 * Create a package name "hw7Q3Encapsulation01" in the HW project. Inside the package, 
 * a) Create a class, Employee. declare some private variable----> Name, age, sex, 
 * usCitizen. How can you access those variables by getter and setter method? Please 
 * execute those variables and print Employee info. Paste the GitHub link below.
 */

public class Employee {

	private String EmpName;
	private int age;
	private char sex;
	private boolean isusCitezen;

	public String getEmpName() {
		return EmpName;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public boolean getisIsusCitezen() {
		return isusCitezen;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setIsusCitezen(boolean isusCitezen) {
		this.isusCitezen = isusCitezen;
	}

}
