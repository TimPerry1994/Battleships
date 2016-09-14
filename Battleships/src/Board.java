
public class Board {

	private int size = 10;
	Ships[][] ships = new Ships[size][size];
	
	public Board() {
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				ships[i][j] = new Empty();
			}
		}
	}
	/*
	void placeShip(Board board, Ships ship, int row, int column){
		
		
		for(int i=0;i<ship.getLength();i++)
			if(ship.isHorizontal()==true){
				if(board.isOccupied(row+i, column)==false){
					board.isOccupied(row+i,column)=true;
				}
				
			}
	}
*/
	boolean isOccupied(int row, int column){
		boolean occupied = false;
		if(ships[row][column].getShipType()!=null){
			occupied = true;
		}
		return occupied;
	}
	
}
