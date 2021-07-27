package hw7Q3Encapsulation01;

public class TestEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setEmpName("Abc");
		employee.setAge(25);
		employee.setSex('M');
		employee.setIsusCitezen(false);

		System.out.println("Name: " + employee.getEmpName() + ", \nAge:" + employee.getAge() + ", \nSex "
				+ employee.getSex() + ", \nIs US Citizen " + employee.isIsusCitezen());
	}
}
