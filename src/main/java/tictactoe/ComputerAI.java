package tictactoe;

public class ComputerAI {

    private final TicTacToe ticTacToe = new TicTacToe();

    public Coordinates generateCoordinates() {

        int x = (int) (Math.random() * (ticTacToe.getBOARD_SIZE()));
        int y = (int) (Math.random() * (ticTacToe.getBOARD_SIZE()));
        return new Coordinates(x, y);
    }
}
