
public class Community5 extends Card{
	
	public Community5()
	{
		super("Go to Jail",0);
	}
	
	public void performAction(Jail j,Player play)
	{
		j.putInJail(play);
	}

}
