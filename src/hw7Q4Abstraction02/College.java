package hw7Q4Abstraction02;

/*c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub.
  */

//Create also one default and one static method dorm and studyRoom inside interface "College".
    public interface College {
    	
	public void commonRoom();

	public void laboratory();

	public void languageClub();
	
	public default void dorm() {
		System.out.println("This is a default method from College interface");
	}
			
	public static void studyRoom() {
		System.out.println("This is a static method from College interface");
	}
		
}
