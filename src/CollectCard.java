
public class CollectCard extends Card{
	public CollectCard(String name, int cost)
	{
		super(name, cost);
	}
	
	public void performAction(Player play)
	{
		play.addMoney(this.getCost());
	}

}
