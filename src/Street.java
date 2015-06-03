public class Street extends Square {
	final private int MAXHOUSES = 4;
	private int houseCost;
	private int rentNow;
	private int rentCost;
	private int rentCostOne;
	private int rentCostTwo;
	private int rentCostThree;
	private int rentCostFour;
	private int rentCostHotel;
	private int mortgageValue;
	private int numHouses;
	private Player owner = null;

	public Street(String name, int index, int cost, int houseco, int rent,
			int rentOne, int rentTwo, int rentThree, int rentFour,
			int rentHotel, int mort) {
		super(name, index, cost);
		this.houseCost = houseco;
		this.rentNow = rent;
		this.rentCost = rent;
		this.rentCostOne = rentOne;
		this.rentCostTwo = rentTwo;
		this.rentCostThree = rentThree;
		this.rentCostFour = rentFour;
		this.rentCostHotel = rentHotel;
		this.mortgageValue = mort;
		this.numHouses = 0;
	}

	public int getHouseCost() {
		return this.houseCost;
	}

	public void setPlayer(Player play) {
		this.owner = play;
	}
	
	public Player getOwner()
	{
		return this.owner;
	}

	public int getRent() {
		return this.rentNow;
	}

	public int addHouse() {
		if (numHouses <= 4) {
			numHouses++;
			if (numHouses == 1) {
				rentNow = rentCostOne;
				return houseCost;
			} 
			else if (numHouses == 2) {
				rentNow = rentCostTwo;
				return houseCost;
			}
			else if (numHouses == 3) {
				rentNow = rentCostThree;
				return houseCost;
			} 
			else if (numHouses == 4) {
				rentNow = rentCostFour;
				return houseCost;
			}
		} 
		else if (numHouses == 4) {
			rentNow = rentCostHotel;
			return houseCost;
		}
		return 0;
	}
	
	public int getHouses()
	{
		return numHouses;
	}

}
