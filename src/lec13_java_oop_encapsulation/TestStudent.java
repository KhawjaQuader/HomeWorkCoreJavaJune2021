package lec13_java_oop_encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Boby");
		student.setStId(483);
		student.setSex('M');
		student.setisUsCitezen(false);
		student.setGrade(3.765f);
		student.setAge(44.68768);
				
		System.out.println("Name: "+student.getStName()+", \nID: "+student.getStId()+", \nSex: "+student.getSex()+", \nUS Citizen: "
		+student.isUsCitezen()+", \ngrade: "+student.getGrade()+" and \nAge: "+student.getAge());

			

	}

}
