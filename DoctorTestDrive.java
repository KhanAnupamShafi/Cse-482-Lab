package cse482.diptu.lab1;

public class DoctorTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FamilyDoctor fd = new FamilyDoctor();
		
		fd.giveAdvice();
		fd.treatPatient();
		
		
		
		Surgeon sd = new Surgeon();
		sd.treatPatient();
		sd.makeIncision();
	}

	
}
