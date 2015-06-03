
public class Square {
	private String myName;
	private int myIndex;
	private int myCost;
	private boolean isRailroad;
	private boolean isStreet;
	private Player owner;
	
	public Square()
	{
		this.myName = "";
		this.myIndex = -1;
		this.myCost = 0;
		this.owner = null;
	}
	
	public Square(String name, int index, int cost)
	{
		this.myName = name;
		this.myIndex = index;
		this.myCost = cost;
		this.isRailroad = false;
		this.owner = null;
	}
	public Square(String name, int index, int cost, boolean rail)
	{
		this.myName = name;
		this.myIndex = index;
		this.myCost = cost;
		this.isRailroad = rail;
		this.owner = null;
	}
	
	public String getName()
	{
		return this.myName;
	}
	
	public int getIndex()
	{
		return this.myIndex;
	}
	
	public int getCost()
	{
		return this.myCost;
	}
	
	public boolean getIsRail()
	{
		return this.isRailroad;
	}
	
	public Player getOwner()
	{
		return this.owner;
	}
	public void setName(String name)
	{
		this.myName = name;
	}
	
	public void setIndex(int index)
	{
		this.myIndex = index;
	}
	
	public void setCost(int cost)
	{
		this.myCost = cost;
	}
	
	public void setPlayer(Player play)
	{
		this.owner = play;
	}
}
