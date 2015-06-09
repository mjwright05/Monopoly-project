
public class CollectPayCard extends Card {
	public CollectPayCard(String name, int cost)
	{
		super(name, cost);
	}
	
	public void performAction(Player play, Player play1)
	{
		play.addMoney(this.getCost());
		play1.pay(this.getCost());
	}
}
