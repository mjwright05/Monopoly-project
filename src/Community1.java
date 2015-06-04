
public class Community1 extends Card{
	
	public Community1()
	{
		super("Advance to go", 200);
	}
	
	public void performAction(Player play)
	{
		play.addMoney(this.getCost());
		play.setLocation(0);
	}
}
