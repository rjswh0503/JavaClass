
public class Character {
	String name;
	int hp;
	
	
	Character(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
	
	void showInfo() {
		System.out.println("이름: " + name + " 체력: " + hp);
		
	}
	
	int takeDamage(int damage) {
		int myhp = hp - damage;
		System.out.println("적이 " + damage + "만큼 공격했습니다.");
		return myhp;
	}
	
}
