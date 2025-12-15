
public class CoffeeShop {
	int MAX_CUP;
	
	
	CoffeeShop(int MAX_CUP){
		this.MAX_CUP = MAX_CUP;
	}
	
	void order() {
		if(0 >= MAX_CUP) {
			return;
		}
		--MAX_CUP;
	}
	
	void showMaxCup() {
		System.out.println("남은 잔: " + MAX_CUP + "잔");
	}
}
