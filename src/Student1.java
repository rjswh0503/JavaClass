
public class Student1 {
	String name;
	String studentId;
	int korean;
	int english;
	int math;
	
	
	
	Student1(String name, String studentId, int korean, int english, int math){
		this.name = name;
		this.studentId = studentId;
		this.korean = korean;
		this.english = english;
		this.math = math;
		
	}
	
	
	void getTotalScore() {
		int result = korean + english + math;
		System.out.println("총점: " + result);
	}	
	
	void getAverage() {
		int avg = (korean + english + math) / 3;
		System.out.println("평균: " + avg);
	}
	
	void printInfo() {
		System.out.println("이름:" + name + " 학번:" + studentId + " 국어점수: " + korean + " 영어점수 : " + english + " 수학: " + math);
		
	}
	
	
	
}
