
public class PractRoom extends Room {



	public PractRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the Chamber of Secrets! You encounter a Basilisk." + "\n GAME OVER");
		Runner.gameOff();
	}
	

}
