//Miruna Andreea Lazar 2459499L

public class Cards {
	// String methods to generate three cards
	public static String getCard() {
		// generates a random number within the 5 elements of the array range
		int randomCard = (int) (Math.random() * 5);
		//
		String cards = new String[] { "King", "Queen", "Jack", "Ace", "Joker" }[randomCard];
		return cards;
	}

	public String toString() {
		return getCard();
	}
}

// Reference:
// https://stackoverflow.com/questions/6726963/random-string-from-string-array-list