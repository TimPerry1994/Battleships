
public class Submarine extends Ships {

	private int length = 3;
	int[] hit = new int[length];
	
	public Submarine() {
		super(3);
	}
	@Override
	public String getShipType(){
		return "Submarine";
	}

}
