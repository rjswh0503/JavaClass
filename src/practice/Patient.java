package practice;

public class Patient {
	/*
	 * 환자가 병원에 가서 진료를 받습니다.
	 * 
	 * 환자는 건강보험증을 가지고 있습니다.(처음부터 가지고 있음 객체 생성)
	 * 
	 * 병원은 처방전을 발급해줍니다.
	 * 
	 * 진료를 받으려면 건강보험증을 제시해야 합니다.
	 * 
	 * */
	
	
	HealthCard healthCard = new HealthCard();
	Prescription prescription;
	
	
	void visit(Hospital hospital) {
		prescription = hospital.diagnose(healthCard);
	}
	
	
	
	
}
