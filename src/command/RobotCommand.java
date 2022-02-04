package command;

public enum RobotCommand {
    PLACE {
        public String toString() {
            return "PLACE";
        }
    },
    ROBOT {
        public String toString() {
            return "ROBOT";
        }
    },
    REPORT {
        public String toString() {
            return "REPORT";
        }
    }
}
