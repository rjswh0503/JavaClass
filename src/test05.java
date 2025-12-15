
public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeShop cp = new CoffeeShop(1000);

		while (true) {
			if (0 >= cp.MAX_CUP) {
				System.out.println("sold out");
				break;
			}
			cp.order();
		}
		cp.showMaxCup();

	}

}
