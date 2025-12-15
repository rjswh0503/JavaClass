
public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("142-4423","신재헌",100000);
		
		bank.showInfo();
		bank.deposit(30000);
		bank.withdraw(70000);
		bank.withdraw(200000);
		bank.applyInterest();
		
		System.out.println("최종 잔액: " + bank.getBalance() + "원");
	}

}
