package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;
import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test
	public void TestEmptyDeck() {
		//TODO: Build a deck, draw until you get a DeckException
		Deck Deck1= new Deck() ;
		boolean deck1=false;
		try {
		for (int i = 1; i<= 100;i++) {
		}Deck1.Draw();}
		catch(DeckException c) {
			deck1 = true;
			assertTrue(deck1);
			
			
		}
		}
	
	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		Deck Deck1= new Deck();
		Card Card1 = Deck1.Draw(eSuit.CLUBS);
		assertTrue(Card1.geteSuit()==eSuit.CLUBS);
		
	}
	
	@Test
	public void TestDrawRank() {
		//TODO: Build a deck, test the Draw(eRank) method
		Deck Deck1= new Deck();
		Card Card1 = Deck1.Draw(eRank.ACE);
		assertTrue(Card1.geteRank()==eRank.ACE);
		
	}
	
	public void TestDeckRankCount() {
		//TODO: Build a deck, test the DeckRankCount method
		Deck Deck1 = new Deck();
		assertEquals(Deck1.Count(eRank.JACK),11);
	}
	
	public void TestDeckSuitCount() {
		//TODO: Build a deck, test the DeckSuitCount method
		Deck Deck1= new Deck();
		assertEquals(Deck1.Count(eSuit.HEARTS),10);
	}

}
