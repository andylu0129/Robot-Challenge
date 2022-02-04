package value;

public enum Direction {
    EAST(0),
    NORTH(90),
    WEST(180),
    SOUTH(270);

    public final int degree;

    private Direction(int degree) {
        this.degree = degree;
    }

    public static Direction valueOf(int degree) {
        if (degree == 0) {
            return Direction.EAST;
        }
        if (degree == 90) {
            return Direction.NORTH;
        }
        if (degree == 180) {
            return Direction.WEST;
        }
        if (degree == 270) {
            return Direction.SOUTH;
        }
        return null;
    }
}
