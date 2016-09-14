
public class Destroyer extends Ships {

	private int length = 4;
	int[] hit = new int[length];
	
	public Destroyer() {
		super(4);
	}
	@Override
	public String getShipType(){
		return "Destroyer";
	}

}
