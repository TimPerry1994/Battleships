import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		Scanner sc = new Scanner(System.in);
		int loop1 = 1;
		int row;
		int col;
		boolean horiz;
		for(int i=0;i<2;i++){
			Carrier patrol = new Carrier();
			do{
				loop1 = 1;
				System.out.print("Enter row: ");
				patrol.setFrontRow(sc.nextInt());
				row = patrol.getFrontRow();
				System.out.print("Enter Column: ");
				patrol.setFrontCol(sc.nextInt());
				col = patrol.getFrontCol();
				System.out.print("Is ship horizontal? (true/false): ");
				patrol.setHorizontal(sc.nextBoolean());
				horiz = patrol.isHorizontal();
			
			
				try{
						
					patrol.okToPlaceAt(row,col,horiz,board);
					if(patrol.okToPlaceAt(row, col, horiz, board)==true){
						patrol.placeShipAt(row, col, horiz, board);
						loop1=0;
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("Error: Placement out of bounds.");
				}
			}while(loop1==1);
			
			//Places ships anyway if the overlap does not occur at the front of the boats.
			
			
	
		}
		System.out.println("fin.");
		sc.close();
	}

}
