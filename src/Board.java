import java.util.ArrayList;


public class Board {
	final private int SIZE = 40;
	private ArrayList<Square> squares = new ArrayList(40);
	
	public Board()
	{
		squares.add(new Square("go",0,0));
		squares.add(new Street("Old Kent Road",1,60,50,2,10,30,90,160,250,30));
		squares.add(new Square("Community Chest",2,0));
		squares.add(new Street("White Chapel Road",3,60,50,4,20,60,180,320,450,30));
		squares.add(new Square("Pay Tax",4,200));
		squares.add(new Railroad("King Cross Station",5,200,true,25));
		squares.add(new Street("The Angel Islington",6,100,50,6,30,90,270,400,550,50));
		squares.add(new Square("Chance",7,0));
		squares.add(new Street("Euston Road",8,100,50,6,30,90,270,400,550,50));
		squares.add(new Street("Pentonville Road",9,120,50,8,40,100,300,450,600,60));
		squares.add(new Jail("Jail",10,50,30));
		squares.add(new Street("Pall Mall",11,140,100,10,50,150,450,625,750,70));
		squares.add(new Square("Electric Company",12,0));
		squares.add(new Street("WhiteHall",13,140,100,10,50,150,450,625,750,70));
		squares.add(new Street("Northumrl'd Avenue",14,160,100,12,60,180,500,700,900,80));
		squares.add(new Railroad("Marylbone Station",15,200,true,25));
		squares.add(new Street("Bow Street",16,180,100,14,70,200,550,750,950,90));
		squares.add(new Square("Community Chest",17,0));
		squares.add(new Street("Marlborough Street",18,180,100,14,70,200,550,750,950,90));
		squares.add(new Street("Vine Street",19,200,100,16,80,220,600,800,1000,100));
		squares.add(new Square("Free Parking",20,0));
		squares.add(new Street("Strand",21,220,150,18,90,250,700,875,1050,110));
		squares.add(new Square("Chance",22,0));
		squares.add(new Street("Fleet Street",23,220,150,18,90,250,700,875,1050,110));
		squares.add(new Street("Trafalgar Square",24,240,150,20,100,300,750,925,1100,120));
		squares.add(new Railroad("Fenchurch Station",25,200,true,25));
		squares.add(new Street("Leicester Square",26,260,150,22,110,330,800,975,1150,130));
		squares.add(new Street("Coventry Street",27,260,150,22,110,330,800,975,1150,130));
		squares.add(new Square("Water Works",28,0));
		squares.add(new Street("Picadilly",29,280,150,24,120,360,850,1025,1200,140));
		squares.add(new Square("Go To Jail",30,0));
		squares.add(new Street("Regent Street",31,300,200,26,130,390,900,1100,1275,150));
		squares.add(new Street("Oxford Street",32,300,200,26,130,390,900,1100,1275,150));
		squares.add(new Square("Community Chest",33,0));
		squares.add(new Street("Bond Street",34,320,200,28,150,450,1000,1200,1400,160));
		squares.add(new Railroad("Liverpool St Station",35,200,true,25));
		squares.add(new Square("Chance",36,0));
		squares.add(new Street("Park Lane",37,350,200,35,175,500,1100,1300,1500,175));
		squares.add(new Square("Super Tax",38,100));
		squares.add(new Street("MayFair",39,400,200,50,200,600,1400,1700,2000,200));
	}
	
	public Square getStartSquare()
	{
	    return (squares.get(0));
	}
	
	public Square getSquare(int index)
	{
		return (squares.get(index));
	}
	
	public Street getStreet(int index)
	{
		return (Street)(squares.get(index));
	}
	
	public Jail getJail()
	{
		return (Jail)(squares.get(10));
	}
}
