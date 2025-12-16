
public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book("점프 투 파이썬", "내가",15000, 10);
		
		bk.sell(2);
		bk.restock(1);
		bk.printInfo();
	}

}
