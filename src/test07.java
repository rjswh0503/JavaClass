
public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("신재헌", 7000);

		ba.deposit(5000);
		
		ba.withdraw(7000);
		System.out.println("=========================");
		System.out.println("현재 잔액: " + ba.getBalance()+ "원");
		System.out.println("=============================");
	}

}
