package hw7Q4Abstraction02;

/*b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom,cafeteria.
 */

//Create one default and one static method morgue and pharmacy inside interface "Hospital"
public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public default void morgue() {
		System.out.println("This is a default method from Hospital interface");
	}

	public static void pharmacy() {
		System.out.println("This is a static method from Hospital interface");
	}

}
