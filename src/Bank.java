
public class Bank {
	private String accountNumber ; //계좌 번호
	private String owner; // 예금주
	private int balance; // 잔액
	private double interestRate = 3.5; // 은행 이자율
	
	
	
	
	
	Bank(String accountNumber, String owner, int balance){
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
		
	}
	
	void deposit(int amount) {
		if(amount < 0) {
			System.out.println("양수만 입금 가능합니다.");
		}else {
			balance += amount;
			System.out.printf("%d원 입금되었습니다. 현재 잔액: %d원\n", amount, balance);
		}
	}
	
	void withdraw(int amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println(amount + "원 출금되었습니다. 현재 잔액: " + balance + "원 입니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	void applyInterest() {
		int interest = (int)(balance * interestRate / 100);
		balance += interest;
		System.out.printf("이자 %d원이 적용되었습니다. 현재 잔액: %d \n",interest, balance);
	}
	
	void showInfo() {
		System.out.println("==== 계좌 정보 ====");
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("예금주: " + owner);
		System.out.println("잔액: " + balance + "원");
		System.out.println("=================");
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
