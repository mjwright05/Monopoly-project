import java.util.ArrayList;


public class CommunityChest extends Deck{
	private ArrayList<Card> deck = new ArrayList<Card>();
	public CommunityChest()
	{
		super("Community Chest");
		deck.add(new Community1());
		deck.add(new CollectCard("Collect 200",200));
		deck.add(new PayCard("Pay 50",50));
		deck.add(new CollectCard("Collect 50", 50));
		deck.add(new GetOutOfJail());
		deck.add(new Community5());
		deck.add(new CollectPayCard("Collect 50 From Each Player", 50));
		deck.add(new CollectCard("Collect 100", 100));
		deck.add(new CollectCard("Collect 20", 20));
		deck.add(new CollectCard("Collect 10", 10));
		deck.add(new CollectCard("Collect 100", 100));
		deck.add(new PayCard("Pay 100", 100));
		deck.add(new PayCard("Pay 150", 150));
		deck.add(new CollectCard("Collect 10", 10));
		deck.add(new CollectCard("Collect 100", 100));
	}
}
