public class Chessboard {
	public static void main(String[] args) {
		char[][] board = new char[8][8];
		//I used a char array because it looks nicer when the board is printed.
		
		char[] row0 = {'r','n','b','q','k','b','k','r'};
		char[] row7 = {'R','N','B','Q','K','B','N','R'};
		board[0] = row0;
		board[7] = row7;
		for(int i=0;i<8;i++) board[1][i]='p';
		for(int i=2;i<6;i++) {
			for(int j=0;j<8;j++) {
				board[i][j]='-';
			}
		}
		for(int i=0;i<8;i++) board[6][i]='P';
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
