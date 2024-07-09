package staticex;

public class Quiz1 {

	public static void main(String[] args) {

		Card card1 = new Card();
		card1.showInfo();
		
		Card card2 = new Card();
		card2.showInfo();
		
		Card card3 = new Card();
		card3.showInfo();
	}

}

class Card {
	
	static int count = 100;
	int cardNum;
	
	public Card() {
		this.cardNum = count;
		count++;
	}
	
	public void showInfo() {
		System.out.println("카드번호: " + cardNum);
	}
}