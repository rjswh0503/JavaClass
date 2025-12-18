
public class E {
	
	
	/*
	 * 
	 *  1. 정수 변수 1개
	 *  생성자로 변수 초기화
	 *  
	 *  메소드 3개
	 * 
	 * 	2. 첫번 쨰 메소드에서 두 번째 메소드 호출 두 번째 메소드에서 세 번째 메서드 호출
	
		
		3. 세번째 메서드에서는 인스턴스 값과 매게변수의 값을 더해서 반환
	
		4. 테스터 클래스에서 위에서 만든 클래스의 첫번째 메소드를 테스트 하시오
	
	 * */
	
	
	//인스턴스 변수
	
	int e;
	
	
	//생성자
	
	E(int e){
		this.e = e;
	}
	
	//메서드
	
	int a1(int e) {
		this.e++;
		return this.a2(e);
		
	}
	
	int a2(int e ) {
		this.e++;
		return this.a3(e);
		
	}
	
	int a3(int e) {
	
		return this.e + e;
		
		
	}
	
	
	
	
	
	
	
	
}
