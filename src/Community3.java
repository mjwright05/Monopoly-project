
public class Community3 extends Card {

	public Community3()
	{
		super("Doctors fee(pay 50)",50 );
	}
	
	public void performAction(Player play)
	{
		play.pay(this.getCost());
	}
}
