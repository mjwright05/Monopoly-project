
public class Dice {
	private int max;
	
	public Dice()
	{
		this.max = 6;
	}
	
	public int roll()
	{
		return (int) ( ( Math.random(  ) * max ) + 1 );
	}
}
