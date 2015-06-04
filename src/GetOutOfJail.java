
public class GetOutOfJail extends Card{
	
	public Player owner;
	
	public GetOutOfJail()
	{
		super("Get out of Jail Free", 0);
	}
	
	public void giveToPlayer(Player play)
	{
		play.addJailCard(this);
		this.owner = play;
	}
	
	public void performAction(Player play)
	{
		play.useJailCard();
	}
}
