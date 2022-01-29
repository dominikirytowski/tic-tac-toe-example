package tictactoe;

public enum Mark {
    PLAYER_ONE('X'), PLAYER_TWO('O'), BLANK(' ');

    private final char sign;

    Mark(char display) {
        this.sign = display;
    }


    @Override
    public String toString() {
        return Character.toString(this.sign);
    }
}
