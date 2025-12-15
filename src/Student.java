
public class Student {
	String name;
	int score;
	
	public Student() {
		
	}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	

	void introduce() {
		System.out.println("이름:" + this.name + " 점수: " + this.score);
		
	}
}
