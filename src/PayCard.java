
public class PayCard extends Card{
	public PayCard(String name, int cost)
	{
		super(name,cost);
	}
	
	public void performAction(Player play)
	{
		play.pay(this.getCost());
	}

}
