
public class Jail extends Square{
	
	private int goToJailIndex;
	private Player prisoner = null;
	private int turns;
	
	public Jail(String name, int index, int cost, int goToIndex)
	{
		super(name, index, cost);
		this.goToJailIndex = goToIndex;
	}
	
	public void putInJail(Player person)
	{
		person.setLocation(this.getIndex());
		prisoner = person;
		turns =0;
	}
	public int roll()
	{
		int roll1 = (int) ( ( Math.random(  ) * 6 ) + 1 );
		int roll2 = (int) ( ( Math.random(  ) * 6 ) + 1 );
		if(roll1 == roll2)
		{
			turns++;
			return roll1+roll2;
		}
		else
		{
			turns++;
			return 0;
		}
	}
	
	public int getGoToIndex()
	{
		return this.goToJailIndex;
	}
	
	public int getTurn()
	{
		return turns;
	}
}
