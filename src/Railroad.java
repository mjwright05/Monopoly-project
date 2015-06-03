
public class Railroad extends Square{
	 private Player owner;
	 private int rent;
	 
	 public Railroad(String name, int index, int cost, boolean rail, int rent)
	 {
		 super(name, index, cost, rail);
		 this.rent = rent;
	 }
	 
	 public int getRent()
	 {
		 return this.rent;
	 }
	 
	 public void setRent(int ren)
	 {
		 this.rent = ren;
	 }
	 
	 public Player getPlayer()
	 {
		 return this.owner;
	 }
	 
	 public void setPlayer(Player play)
	 {
		 this.owner = play;
	 }
}
