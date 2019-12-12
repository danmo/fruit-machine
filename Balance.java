//Miruna Andreea Lazar 2459499L

public class Balance {
	static int balance;

	public static int BalanceUpdates() {
		// initial balance
		balance = 100;
		while (balance >= 0 || balance < 150) {
			// cards
			Cards cardOne = new Cards();
			Cards cardTwo = new Cards();
			Cards cardThree = new Cards();
			if (cardOne.equals("Joker") || cardTwo.equals("Joker") || cardThree.equals("Joker")) {
				balance = balance - 25;
			} else if (cardOne.equals(cardTwo) && cardTwo.equals(cardThree) && cardOne.equals(cardThree)) {
				balance = balance + 50;
			}
			if (cardOne.equals(cardTwo) || cardTwo.equals(cardThree) || cardOne.equals(cardThree)) {
				balance = balance + 20;
			}
			System.out.println(cardOne);
			System.out.println(cardTwo);
			System.out.println(cardThree);
		}
		return balance;
	}

	public static void main(String[] args) {
		BalanceUpdates();
		System.out.println(balance);
	}
}
