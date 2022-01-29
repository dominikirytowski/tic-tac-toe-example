package tictactoe;

public class Player {

    private final Mark playerChar;

    public Player(Mark playerChar) {
        this.playerChar = playerChar;
    }

    public Mark getPlayerChar() {
        return playerChar;
    }
}
