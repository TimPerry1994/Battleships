
public class Carrier extends Ships {

	private int length = 5;
	int[] hit = new int[length];
	
	public Carrier() {
		super(5);
	}
	
	@Override
	public String getShipType(){
		return "Carrier";
	}

}
