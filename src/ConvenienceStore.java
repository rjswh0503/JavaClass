
public class ConvenienceStore {
	
	// 편의점에서는 처음부터 음료수를 가지고 있기 때문에 객체를 생성
	Drink drink = new Drink();
	Allowance allowance;// 용든은 학생이 편의점에서 음료수를 사야 생기니까 맴버변수 선언만 
	
	
	Drink sell(Allowance allowance) {
		this.allowance = allowance;
		return drink;
	}
	
	
}
