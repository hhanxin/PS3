package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import pkgException.DeckException;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	//TODO: Fix the Draw method so it throws an exception if the deck is empty
	public Card Draw() throws DeckException{
		if(this.cardsInDeck.size() == 0) {
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);
	}
	public Card Draw(eSuit eSuit) {
		for (Card c: this.cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return c;
			}
		}
		return null;
	}
	public Card Draw(eRank eRank) {
		for(Card c: this.cardsInDeck) {
			if(c.geteRank()== eRank) {
				cardsInDeck.remove(c);
				return c;
			}
		}
		return null;
	}
public int Count(eSuit eSuit) {
	int cardNumber = 0;
	for(Card c:this.cardsInDeck) {
		if(c.geteSuit()==eSuit) {
			cardNumber++;
		}
	}
	return cardNumber;
}
public int Count(eRank eRank) {
	int cardNumber = 0;
	for(Card c:this.cardsInDeck) {
		if(c.geteRank()==eRank) {
			cardNumber++;
		}
	}
	return cardNumber;
}
public int Count(Card c) {
	
	for(Card cards:cardsInDeck) {
		if(cards == c) {
			return 1;
		}
	}
	return 0;
}
	
	
}
