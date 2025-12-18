package practice;

public class Hospital {
	
	Prescription prescription = new Prescription();
	HealthCard healthCard;
	
	
	Prescription diagnose(HealthCard healthCard) {
		this.healthCard = healthCard;
		return prescription;
	}
	

}
