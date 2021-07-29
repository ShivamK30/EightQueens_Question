public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		if(square<8 || (square>15 && square<24) || (square>31 && square<40) || (square>47 && square<56)) {
			if((square)%2==0)
				return false;
		}
		else
			if((square)%2==1)
				return false;
		System.out.println(square);
		return true;
	}
}
