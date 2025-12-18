
public class Member {
	// 회원이 도서관에 가서 책을 빌림
	// 회원은 회원증을 처음부터 가지고 있음 (객체 생성)
	// 도서관은 책을 대여해줌 ( 도서관은 책을 처음부터 가지고 있고 그걸 회원에게 빌려줌 객체생성)
	// 책을 빌리려면 회원증을 제시해야 함.
	
	
	MemberCard memberCard = new MemberCard();
	Book1 book1;
	
	
	void brrow(Library library) {
		book1 = library.lend(memberCard);
		memberCard = null;
	}
	
	
	
	
	
}
