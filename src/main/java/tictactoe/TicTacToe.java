package tictactoe;


public class TicTacToe {

    private final int BOARD_SIZE = 5;
    private final Mark[][] board = new Mark[BOARD_SIZE][BOARD_SIZE];

    public TicTacToe() {
        initBoard();
    }

    public void printBoard() {
        for (int y = 0; y < BOARD_SIZE; y++) {
            for (int x = 0; x < BOARD_SIZE; x++) {
                System.out.print(" [" + board[x][y] + "] ");
            }
            System.out.println();
        }
    }

    public void markField(Coordinates coordinates, Player player) {
        if (coordinates.getY() > BOARD_SIZE || coordinates.getX() > BOARD_SIZE) {
            throw new IllegalStateException("Wrong coordinates!");
        } else if (!board[coordinates.getX()][coordinates.getY()].equals(Mark.BLANK)) {
            throw new IllegalStateException("This field <" + coordinates.getX() + ", " + coordinates.getY() + "> is already marked! " + board[coordinates.getX()][coordinates.getY()]);
        }
        board[coordinates.getX()][coordinates.getY()] = player.getPlayerChar();
    }

    private void initBoard() {
        for (int y = 0; y < BOARD_SIZE; y++) {
            for (int x = 0; x < BOARD_SIZE; x++) {
                board[x][y] = Mark.BLANK;
            }
        }
    }

    public int getBOARD_SIZE() {
        return BOARD_SIZE;
    }

    public boolean checkWin() {
        //TODO: check winner
        return true;
    }

}
