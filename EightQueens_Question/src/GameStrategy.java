public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................	
						
		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................
		*/
		/*for(int k=0;k<8;k++) {
			for(int m=0;m<8;m++)
				System.out.print(placedQueens[k][m]+" ");
			System.out.println("\n");
		}*/
			
		if(numQueens==0) {
			placedQueens[row][col]=true;
			numQueens+=1;
			return true;
		}
		for(int i=0;i<8;i++) {
			if(placedQueens[i][col]==true)
				return false;
		}
		for(int j=0;j<8;j++) {
			if(placedQueens[row][j]==true)
				return false;
		}
		for(int k=0;k<8;k++) {
			if(col-k>0 && row-k>0) 
				if(placedQueens[row-k][col-k]==true)
					return false;
			if(col-k>0 && row+k<7) 
				if(placedQueens[row+k][col-k]==true)
					return false;
			if(col+k<7 && row-k>0) 
				if(placedQueens[row-k][col+k]==true)
					return false;
			if(col+k<7 && row+k<7) 
				if(placedQueens[row+k][col+k]==true)
					return false;
			
			
		}
		numQueens+=1;
		placedQueens[row][col]=true;
		
		return isValid;
	}
}

