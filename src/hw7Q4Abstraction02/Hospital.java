package hw7Q4Abstraction02;

/*b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom,cafeteria.
 */

//Create one default and one static method morgue and pharmacy inside interface "Hospital"
    public interface Hospital {
    	
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();
	
    public void morgue();
		
	public static void pharmacy(String []args) {
		
	}
	
}
