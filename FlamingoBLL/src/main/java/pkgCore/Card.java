package pkgCore;

import pkgEnum.*;

public class Card implements Comparable {

	public static eRank eRank;
	public static eSuit eSuit;
	
	public Card(eRank Rank, eSuit Suit) {
		this.seteRank(Rank);
		this.seteSuit(Suit);
	}
	
	public eRank geteRank() {
		return eRank;
	}
	
	public eSuit geteSuit() {
		return eSuit;
	}
	
	private void seteRank(eRank Rank) {
		eRank = Rank;
	}
	
	private void seteSuit(eSuit Suit) {
		eSuit = Suit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
	}
}
