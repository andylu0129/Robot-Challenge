package command;

public enum Action {
    LEFT(90) {
        public String toString() {
            return "LEFT";
        }
    },
    RIGHT(-90) {
        public String toString() {
            return "RIGHT";
        }
    },
    MOVE(0) {
        public String toString() {
            return "MOVE";
        }
    };

    public final int value;

    private Action(int value) {
        this.value = value;
    }

    public static boolean contains(String command) {
        if (command.equals(Action.LEFT.toString())) {
            return true;
        } else if (command.equals(Action.RIGHT.toString())) {
            return true;
        } else if (command.equals(Action.MOVE.toString())) {
            return true;
        }

        return false;
    }
}
