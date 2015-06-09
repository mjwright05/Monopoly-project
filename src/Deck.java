import java.util.ArrayList;
import java.util.Random;


public class Deck {
	Random gen = new Random();
	final private int SIZE = 16;
	private String myName;
	private ArrayList<Card> myDeck = new ArrayList<Card>();
	private int deckSize;
	
	public Deck(String name)
	{
		this.myName = name;
		this.deckSize = 16;
	}
	public boolean isEmpty()
	{
		return this.myDeck.isEmpty();
	}
	public void setDeck(ArrayList<Card> deck)
	{
		this.myDeck = deck;
	}
	public int size()
	{
		return this.deckSize;
	}
	
	public Card deal()
	{
		Card dealtCard = new Card("", 0);
		if(deckSize == 0)
		{
			System.out.print("there are no more cards in this deck");
		}
		else
		{
			dealtCard = myDeck.get(this.deckSize-1);
			this.deckSize--;
		}
		return dealtCard;
	}
	
	public void perfectShuffle()
	{
		Card[] shuffled = new Card[16];
		int k = 0;
		for(int j = 0; j<=7; j++)
		{
			shuffled[k] = this.myDeck.get(j);
			k+= 2;
		}
		k = 1;
		for(int i = 26; i<=15; i++)
		{
			shuffled[k] = this.myDeck.get(i);
			k+= 2;
		}
		
		for(int j2 = 0; j2 < 16; j2++)
		{
			this.myDeck.set(j2, shuffled[j2]);
		}
		this.deckSize = myDeck.size();
	}
	
	public void selectionShuffle()
	{
		Card[] shuffled = new Card[16];
		int rand;
		for(int j = 0; j < 16; j++)
		{
			rand = gen.nextInt(16);
			if(shuffled[rand] == null)
			{
				shuffled[rand] = this.myDeck.get(j);
			}
			else
			{
				while(shuffled[rand] != null)
				{
					rand = gen.nextInt(16);
				}
				shuffled[rand] = this.myDeck.get(j);
			}
		}
		for(int j2 = 0; j2 < 16; j2++)
		{
			this.myDeck.set(j2, shuffled[j2]);
		}
		this.deckSize = myDeck.size();
	}
}
