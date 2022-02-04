package command;

public enum Direction {
    EAST(0) {
        public String toString() {
            return "EAST";
        }
    },
    NORTH(90) {
        public String toString() {
            return "NORTH";
        }
    },
    WEST(180) {
        public String toString() {
            return "WEST";
        }
    },
    SOUTH(270) {
        public String toString() {
            return "SOUTH";
        }
    };

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
