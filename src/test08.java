
public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10; // 기본타입
		
		D d2 = new D(20); // 참조타입은 new를 사용 (법칙)
	
		d2.d(20);
		
		D d3 = new D();
		
		d3.d(4, 5);
		
		D d4 = new D();
		
		
		d4.d(4, 7, "asdf");
	}
	

}
