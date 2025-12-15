

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character ct = new Character("고을",100);
		ct.showInfo();
		
		int hp = ct.takeDamage(60);
		System.out.println("남은 체력:" + hp);
		
		
	}

}
