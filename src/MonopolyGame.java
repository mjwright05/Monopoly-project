import java.util.ArrayList;


public class MonopolyGame {
	final private int MAX_PLAYERS = 2;
	private Board myBoard;
	private ArrayList<Player> players = new ArrayList(MAX_PLAYERS);
	private int turn;
	
	public MonopolyGame()
	{
		this.players.add(new Player("Player1", 0, 1500));
		this.players.add(new Player("Player2", 0, 1500));
		this.myBoard = new Board();
		this.turn = 0;
	}
	
	public void playRound()
	{
		int spot;
		if(turn % 2 == 0)
		{
			spot = players.get(0).takeTurn();
			if(myBoard.getSquare(spot).getName().equalsIgnoreCase("Pay Tax") || myBoard.getSquare(spot).getName().equalsIgnoreCase("Super Tax"))
			{
				players.get(0).pay(myBoard.getSquare(spot).getCost());
			}
			else if(myBoard.getSquare(spot).getName().equalsIgnoreCase("Go To Jail"))
			{
				this.myBoard.getJail().putInJail(players.get(0));
			}
		}
		else
		{
			spot = players.get(1).takeTurn();
			if(myBoard.getSquare(spot).getName().equalsIgnoreCase("Pay Tax") || myBoard.getSquare(spot).getName().equalsIgnoreCase("Super Tax"))
			{
				players.get(1).pay(myBoard.getSquare(spot).getCost());
			}
			else if(myBoard.getSquare(spot).getName().equalsIgnoreCase("Go To Jail"))
			{
				this.myBoard.getJail().putInJail(players.get(1));
			}
		}
	}
	
	public void endTurn()
	{
		this.turn+=  1;
	}
	
	public void playerBuyHouse(int index)
	{
		if(turn%2 ==0)
		{
			players.get(0).buyHouse(index);
		}
		else
		{
			players.get(1).buyHouse(index);
		}
	}
	
	public void playerBuyLocation(int index)
	{
		if(turn%2 ==0)
		{
			players.get(0).buyLocation(myBoard.getSquare(index));
		}
		else
		{
			players.get(1).buyLocation(myBoard.getSquare(index));
		}
	}
	
	public Player getPlayer(int spot)
	{
		return players.get(spot);
	}
	
	public Board getBoard()
	{
		return myBoard;
	}
	
	public int getTurn()
	{
		return turn;
	}
	
}
