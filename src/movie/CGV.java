package movie;

public class CGV {
	
	Ticket[] sell(int size) {
		if(3 < size) return null;
			Ticket[] tArr = new Ticket[size];
			for(int i = 1; i <= size; i++) {
				tArr[i-1] = new Ticket();
			}
			return tArr;
		}
		
	}
	
