package hw8Q6Abstraction03;
/*
 *   Now create a class TestInstitute.
 *   Then Instantiate
 *   ColumbiaUniversity , 
 *   RockefellerUniversity, 
 *   University, 
 *   Hospital, 
 *   MedicalSchool 
 *   and NursingSchool one by one. 
 *   
 *   Call all the possible methods from
 *   ColumbiaUniversity ,
 *   RockefellerUniversity,
 *   University, 
 *   Hospital, 
 *   MedicalSchool 
 *   and NursingSchool. 
 *   
 *   Paste the github link below.
 */
public class TestInstitute {

	public static void main(String[] args) {
		
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		columbiaUniversity.gymnasium();
		columbiaUniversity.caring();
		columbiaUniversity.computerLab();
		columbiaUniversity.dorm();
		columbiaUniversity.gymnasium();
		columbiaUniversity.morgue();
		columbiaUniversity.physics();
		columbiaUniversity.statistics();
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
		rockefellerUniversity.statistics();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.physics();
				
		NursingSchool nursingSchool = new NursingSchool() {
			
			@Override
			public void hygine() {
				// TODO Auto-generated method stub
				
			}
		};
		MedicalSchool medicalSchool = new MedicalSchool() {
			
			@Override
			public void hygine() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void biochemistryLab() {
				// TODO Auto-generated method stub
				
			}
		};
		Hospital hospital = new Hospital() {
			
			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub
				
			}
		};
		University university = new University() {
			
			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void languageClub() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void laboratory() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void commonRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void teacher() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void field() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void classSize() {
				// TODO Auto-generated method stub
				
			}
		};
	
		

	}

}
