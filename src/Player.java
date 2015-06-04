import java.util.ArrayList;


public class Player {
	private String myName;
	private int myLocation;
	private int myMoney;
	private Dice[] myDice;
	private ArrayList<Square> myProperties = new ArrayList();
	private ArrayList<Railroad> myRail = new ArrayList();
	private ArrayList<GetOutOfJail> out = new ArrayList();
	public Player()
	{
		this.myName = "";
		this.myDice = new Dice[2];
		this.myLocation = 0;
		this.myMoney = 1500;
	}
	
	public Player(String name, int location, int money)
	{
		this.myName = name;
		this.myLocation = location;
		this.myDice = new Dice[2];
		myDice[0] = new Dice();
		myDice[1] = new Dice();
		this.myMoney = money;
	}
	
	public int takeTurn()
	{
		int diceTotal = 0;
		int endTotal;
		diceTotal += myDice[0].roll();
		diceTotal += myDice[1].roll();
		endTotal = myLocation + diceTotal;
		if(endTotal <= 39)
		{
			this.myLocation = endTotal;
			return this.myLocation;
		}
		else		
		{
			this.myMoney += 200;
			this.myLocation = endTotal - 40;
			return this.myLocation;
		}
	}
	
	public void setLocation(int a)
	{
		this.myLocation = a;
	}
	
	public int getLocation()
	{
		return this.myLocation;
	}
	
	public String getName()
	{
		return this.myName;
	}
	
	public void pay(int money)
	{
		this.myMoney -= money;
	}
	
	public int buyLocation(Square house)
	{
		if(myMoney >= house.getCost() && house.getCost() != 0)
		{
			if(house.getIsRail())
			{
				this.myMoney-= house.getCost();
				((Railroad)house).setPlayer(this);
				myRail.add(((Railroad)house));
				if(myRail.size() == 2)
				{
					myRail.get(0).setRent(50);
					myRail.get(1).setRent(50);
				}
				else if(myRail.size() == 3)
				{
					myRail.get(0).setRent(100);
					myRail.get(1).setRent(100);
					myRail.get(2).setRent(100);
				}
				else if(myRail.size() == 4)
				{
					myRail.get(0).setRent(200);
					myRail.get(1).setRent(200);
					myRail.get(2).setRent(200);
					myRail.get(3).setRent(200);
				}
				return this.myMoney;
			}
			
			else
			{
				this.myMoney-= house.getCost();
				((Street)house).setPlayer(this);
				myProperties.add(house);
				return this.myMoney;
			}
		}
		else
		{
			return this.myMoney;
		}
	}
	
	public int buyHouse(int index)
	{
		if(index <= myProperties.size())
		{
			this.myMoney -=((Street)myProperties.get(index)).addHouse();
			return myMoney;
		}
		return myMoney;
	}
	
	public int getMoney()
	{
		return this.myMoney;
	}
	
	public Square getProperty(int index)
	{
		return myProperties.get(index);
	}
	
	public void addMoney(int money)
	{
		this.myMoney += money;
	}
	
	public void addJailCard(GetOutOfJail o)
	{
		this.out.add(o);
	}
	
	public void useJailCard()
	{
		if(out.size() >= 1)
			this.out.remove(out.size()-1);
	}
}
