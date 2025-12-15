
public class Calculator {
	// 두 정수를 받아서 그 합을 반환해 주는 메소드
	
	
	int num1;
	int num2;
	
	// void는 비어있는 상태 
	// 이 메서드는 반환형
	// 메서드 선언부
	// 더하기 메서드
	int add(int num1, int num2) {
		//메서드 바디부 
		int sum = num1 + num2;
		return sum; 
	}
	// 곱셈 메서드
	int multiply(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
	
	// 뺄셈 메서드 
	int minus(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}
	
	// 나눗셈 메서드
	int division(int num1, int num2) {
		int sum = num1 / num2;
		return sum;
	}
	
	//나눗셈 나머지 메서드
	int division2(int num1, int num2) {
		int sum = num1 % num2;
		return sum;
	}
	
}
