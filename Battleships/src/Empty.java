
public class Empty extends Ships {

	private int length = 1;
	
	public Empty(){
		super(1);
	}

	@Override
	public boolean shootAt(int row, int column){
		return false;
	}
	@Override
	public boolean isSunk(){
		return false;
	}
	
	
	

}
