
public class Library {
	
	// 처음에 책을 가지고 있음 (객체생성)
	
	Book1 book = new Book1();
	
	// 회원증은 회원이 책을 빌릴 때 줘야 하기 떄문에 객체생성 x
	
	MemberCard memberCard;
	

	Book1 lend(MemberCard memberCard){
		this.memberCard = memberCard;
		return book;
	}
}
