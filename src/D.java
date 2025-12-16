
public class D {
	
	// 클래스 구성요소 3가지 정보 생성자 처리 
	
	// 정보
	int d; // 인스턴스 변수 (맴버변수) 
	int a;
	String c;
	
	// 생성자 Constructor
	
	D(){
		this.d = d;
	}
	
	
	D(int d){
		this.d = d;
	}
	
	D(int a, int d){
		this.a = a;
		this.d = d;
	}
	
	D(int a, int d, String c){
		this.a = a;
		this.d = d;
		this.c = c;
	}
	
	
	
	//처리
	
	void d() {
		System.out.println("숫자는: " + d);
	}
	
	void d(int d) {
		System.out.println("숫자는: " + d);
	}
	
	void d(int a, int b) {
		System.out.println("숫자는: " + (a + b));
	}
	
	void d(int a, int b, String c) {
		System.out.println("숫자는: " + (a + b) + c);
	}
	
	
	
}
