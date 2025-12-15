
public class BankAccount {

	String owner;
	int balance;
	
	BankAccount(String owner, int balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	boolean deposit(int amount) {
			if(amount <= 0) {
				System.out.println("입금 실패 0원 이상부터 입금 가능합니다. ");
				return false;
			}else {
				balance += amount;
				System.out.println("===========================");
				System.out.printf("입금 금액: %d원\n", amount);
				System.out.println("");
				System.out.println("입금 후 잔액:" + balance+"원");
				System.out.println("===========================");
				return true;
			}
		
	}
	
	boolean withdraw(int amount) {
		if(amount > balance) {
			System.out.println("출금 실패, 잔액 보다 큰 금액을 출금할 수 없습니다." + " 현재 잔액 : " + balance);
			return false;
		}else {
			balance -= amount;
			System.out.println( "출금금액: " + amount);
			System.out.println("출금 후 잔액: " + balance +"원");
			return true;
		}
	}
	
	int getBalance() {
		return balance;
	}
	
	
	

}
