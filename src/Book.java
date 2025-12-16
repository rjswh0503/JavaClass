
public class Book {
	private String title;
	private String author;
	private int price;
	private int stock;
	
	
	
	Book(String title, String author, int price, int stock){
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
		
	}
	
	
	public String getTitle() {
		return title;
		
	}
	
	public String getAuthor() {
		return author;
		
	}
	
	public int getPrice() {
		return price;
		
	}
	
	public int getStock() {
		return stock;
		
	}
	
	
	
	
	
	
	void sell(int sell) {
		if(sell < stock) {
			int result = stock -= sell;
			System.out.println("구매 완료 했습니다.!!\n남은 재고 : " + result);
			
		}else if(sell > stock) {
			System.out.println("재고 부족!!");
		}
		
	}
	
	void restock(int add) {
		int addStock = add += stock;
		System.out.println("재고 추가 완료! 현재 재고 :" + addStock);
	
	}
	
	void printInfo() {
		System.out.println("제목: " + title + " 저자:" + author + " 가격:" + price + " 재고:" + stock);
	}
	
	
}
