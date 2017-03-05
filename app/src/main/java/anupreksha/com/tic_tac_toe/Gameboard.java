package anupreksha.com.tic_tac_toe;

public class Gameboard {

    private String[][] board = new String[3][3];


    //Clears the game board by looping through each row and column and puts the empty string
    public void clear() {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                board[i][j] = "";

            }

        }

    }

    //getter that returns the virtual board
    public String[][] getBoard() {
        return board;
    }
    //checking that there is no mark initially
    public void placeMark(int x,int y,String mark){
        if (board[x][y].equals(""))
            board[x][y]=mark;
    }

    public boolean isWinner()
    {
        if(board[0][0].equals(board[1][1])&&board[1][1].equals(board[2][2])&&!board[0][0].equals(""))
            return true;
        if(board[2][0].equals(board[1][1])&& board[1][1].equals(board[0][2])&&!board[2][0].equals(""))
            return true;
        for(int i=0;i<3;i++)
        {
            if(board[i][0].equals(board[i][1])&&board[i][1].equals(board[i][2])&&!board[i][0].equals(""))
                return true;
            if(board[0][i].equals(board[1][i])&&board[1][i].equals(board[2][i])&&!board[0][i].equals(""))
                return true;
        }
        return false;
    }
}



