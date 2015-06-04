
public class Card {
	private String myName;
	private int myCost;
	
	public Card(String name, int cost)
	{
		this.myName = name;
		this.myCost = cost;
	}

	public String getName() {
		return myName;
	}

	public void setName(String myName) {
		this.myName = myName;
	}

	public int getCost() {
		return myCost;
	}

	public void setCost(int myCost) {
		this.myCost = myCost;
	}
	
	
}
