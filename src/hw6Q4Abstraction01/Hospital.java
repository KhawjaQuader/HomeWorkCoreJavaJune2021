package hw6Q4Abstraction01;

/*b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom,cafeteria.
 */
public interface Hospital {//Interface created

	public void emergencyRoom();//Method declared

	public void surgeryRoom();

	public void cafeteria();
}// We can not create Default constructor inside Interface as it can not instantiate
