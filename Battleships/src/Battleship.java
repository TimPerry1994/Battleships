
public class Battleship extends Ships {
	

	private int length = 3;
	int[] hit = new int[length];
	
	public Battleship() {
		super(3);
	}
	@Override
	public String getShipType(){
		return "Battleship";
	}

}
