package tictactoe;

public class Coordinates {

    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalStateException("One of coordinates x or y equals 0 or is negative!");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Coordinates c = (Coordinates) obj;
        return this.getX() == c.getX() && this.getY() == c.getY();
    }

    public int getY() {
        return y;
    }
}
