
public class Community2 extends Card {
	
	public Community2()
	{
		super("Bank error in your favor(get $200)", 200);
	}
	
	public void performAction(Player play)
	{
		play.addMoney(this.getCost());
	}
}
