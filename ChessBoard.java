public class ChessBoard{
	/*
	* Black is represented by lowercase characters
	* White is represented by uppercase characters
	*/
	private char[][] boardView = {
		{ 'r','n','b','q','k','b','n','r'},
		{ 'p','p','p','p','p','p','p','p'},
		{ ' ',' ',' ',' ',' ',' ',' ',' '},
		{ ' ',' ',' ',' ',' ',' ',' ',' '},
		{ ' ',' ',' ',' ',' ',' ',' ',' '},
		{ ' ',' ',' ',' ',' ',' ',' ',' '},
		{ 'P','P','P','P','P','P','P','P'},
		{ 'R','N','B','Q','K','B','N','R'},
	};
	
	public ChessBoard(){
	}
	
	public static int mapPos(String pos){
		return (8 - Character.getNumericValue(pos.charAt(1)))*8 + Character.getNumericValue(pos.charAt(0)) - 10;
	}
	
	public char pieceAt(int mapPos){
		return boardView[mapPos/8][mapPos%8];
	}
	
	public char pieceAt(String pos){
		return pieceAt(mapPos(pos));
	}
	
	public void setPiece(int mapPos, char piece){
		boardView[mapPos/8][mapPos%8] = piece;
	}
	
	public void setPiece(String pos, char piece){
		setPiece(mapPos(pos), piece);
	}
	
	public void removePiece(int mapPos){
		setPiece(mapPos, ' ');
	}
	
	public void removePiece(String pos){
		setPiece(mapPos(pos), ' ');
	}
	
	public char[][] getBoardView(){
		return boardView;
	}
	
	public void printBoardView(){
		for(int i = 0; i < 8; i++){
			System.out.print("\n+---+---+---+---+---+---+---+---+\n|");
			for(int j = 0; j < 8; j++){
				System.out.printf(" %c |",boardView[i][j]);
			}
		}
		System.out.println("\n+---+---+---+---+---+---+---+---+");
	}
	
	
	/**
	public static void main(String[] args){
		ChessBoard myBoard = new ChessBoard();
		System.out.println(myBoard.pieceAt("A1"));
		System.out.println(myBoard.pieceAt("B1"));
		System.out.println(myBoard.pieceAt("C1"));
		System.out.println(myBoard.pieceAt("D1"));
		System.out.println(myBoard.pieceAt("E1"));
		System.out.println(myBoard.pieceAt("F1"));
		System.out.println(myBoard.pieceAt("G1"));
		System.out.println(myBoard.pieceAt("H1"));
		System.out.println(myBoard.pieceAt("A8"));
		System.out.println(myBoard.pieceAt("B8"));
		System.out.println(myBoard.pieceAt("C8"));
		System.out.println(myBoard.pieceAt("D8"));
		System.out.println(myBoard.pieceAt("E8"));
		System.out.println(myBoard.pieceAt("F8"));
		System.out.println(myBoard.pieceAt("G8"));
		System.out.println(myBoard.pieceAt("H8"));
		myBoard.printBoardView();
	}
	**/
}

