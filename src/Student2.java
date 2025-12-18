
public class Student2 {
	// 학생이 편의점에 가서 음료수를 삽니다.
	// 학생은 용돈을 가지고 있습니다.
	// 편의점은 음료수를 판매합니다.

	// 용돈은 학생이 처음부터 가지고 있기 때문에 객체 생성
	Allowance allowance = new Allowance();
	Drink drink; // 음료수는 편의점에서 사야 생기기 때문에 선언만
	
	
	void buy(ConvenienceStore convienienceStore) {
		drink = convienienceStore.sell(allowance);
		allowance = null;
	}
	
	
	
	
	
}
