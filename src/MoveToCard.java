
public class MoveToCard extends Card{
	private int location;
	public MoveToCard(String name,int cost, int loc)
	{
		super(name, cost);
		this.location = loc;
	}
	
	public int actionPerformed(Player play)
	{
		if(play.getLocation() >= location)
		{
			play.setLocation(location);
			play.addMoney(this.getCost());
			return location;
		}
		else
		{
			play.setLocation(location);
			return location;
		}
	}
}
