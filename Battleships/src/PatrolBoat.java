
public class PatrolBoat extends Ships {

	private int length = 2;
	int[] hit = new int[length];
	
	public PatrolBoat() {
		super(3);
	}
	@Override
	public String getShipType(){
		return "Patrol Boat";
	}

}
