import java.util.ArrayList;


public class Chance extends Deck{
	private ArrayList<Card> deck = new ArrayList<Card>();
	public Chance()
	{
		super("Chance");
		deck.add(new Community1());
		deck.add(new MoveToCard("Move to location number 24", 200, 24));
		deck.add(new MoveToCard("Move to location number 11", 200, 11)); 
		deck.add(new GoToUtilityCard("Go to Utility", 0,12, 28 ));
	}

}
