
public class GoToUtilityCard extends Card{
	private int location1;
	private int location2;
	public GoToUtilityCard(String name, int cost, int loc1, int loc2)
	{
		super(name, cost);
		this.location1 = loc1;
		this.location2 = loc2;
	}
	
	public int actionPerformed(Player play)
	{
		int dif1 = play.getLocation() - location1;
		int dif2 = play.getLocation() - location2;
		if(Math.abs(dif1) < Math.abs(dif2))
		{
			play.setLocation(location1);
			return location1;
		}
		else if(Math.abs(dif1) > Math.abs(dif2))
		{
			play.setLocation(location2);
			return location2;
		}
		else if(play.getLocation() >= location1)
		{
			play.setLocation(location1);
			return location1;
		}
		else
		{
			play.setLocation(location2);
			return location2;
		}
	}
}
