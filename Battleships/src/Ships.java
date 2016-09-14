
public abstract class Ships {

	private int frontRow;
	private int frontCol;
	private boolean isHorizontal;
	private boolean isHit[] = new boolean[5];
	private int length;
	private String type = null;
	
	public Ships(int length) {
		// TODO Auto-generated constructor stub
		this.length = length;
	}
	
	int getLength(){
		return length;
	}

	public int getFrontRow() {
		return frontRow;
	}

	public void setFrontRow(int frontRow) {
		this.frontRow = frontRow;
	}

	public int getFrontCol() {
		return frontCol;
	}

	public void setFrontCol(int frontCol) {
		this.frontCol = frontCol;
	}

	public boolean isHorizontal() {
		return isHorizontal;
	}

	public void setHorizontal(boolean isHorizontal) {
		this.isHorizontal = isHorizontal;
	}
	
	public String getShipType(){
		//return type of ship		
		return type;
	}
	
	void setShipType(String type){
		this.type = type;
	}
	
	public boolean okToPlaceAt(int frontRow, int frontCol, boolean isHorizontal, Board board){
		//check if ship placement is legal
		boolean ok = true;
		
		if(isHorizontal==false){
			for(int i=frontRow;i>frontRow-(length);i--){
				if(board.isOccupied(i,frontCol)==true){
					System.out.println("Error: Placement overlap at "  + i + ", " + frontCol);
					ok = false;
					
				}
			}
					}
		if(isHorizontal==true){
			for(int i=frontCol;i<frontRow-(length);i++){
				if(board.isOccupied(frontRow,i)==true){
					System.out.println("Error: Placement overlap at " + frontRow + ", " + i);
					ok = false;
					
				}
			}
		}
		if(ok==true){
			System.out.println("This placement is okay");
		}
		return ok;
	}
	
	public void placeShipAt(int frontRow, int frontCol, boolean isHorizontal, Board board){
		if(isHorizontal==false){
			for(int i=frontRow;i>frontRow-(length);i--){
				board.ships[i][frontCol].setShipType("thing");
				System.out.println(i + ", " + frontCol + " is now occupied");
			}
		}
		if(isHorizontal==true){
			for(int i=frontCol;i<frontCol+(length);i++){
				board.ships[i][frontCol].setShipType("thing");
				System.out.println(frontRow + ", " + i + " is now occupied");
			}
		}
	}
	
	public boolean shootAt(int row, int column){
		int index = 0;
		if(isHorizontal==false){
			for(int i=frontRow;i>frontRow-(length);i--){
				if(column==frontCol){
					isHit[i] = true;
					index = i;
					
				}
				
			}
		}
		if(isHorizontal==true){
			for(int i=frontCol;i<frontCol+(length);i++){
				if(row==frontRow&&column==i){
					isHit[i] = true;
					index = i;
					
				}
				
			}
		}
		return isHit[index];	
	}
	
	public boolean isSunk(){
		
		boolean sunk = true;
		for(int i=0;i<length;i++){
			
			if(isHit[i]==false){
				sunk=false;
				continue;
			}
		}
		return sunk;
	}

	
}
