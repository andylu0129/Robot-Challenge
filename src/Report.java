import java.util.List;

import object.Robot;

public class Report {
    private StringBuilder output;

    public Report() {
        output = new StringBuilder();
    }

    public void printReport(List<Robot> robots) {

        for (Robot robot : robots) {
            if (robot.isActive()) {
                output.append("\nOutput: ");
                output.append("ROBOT " + (robots.indexOf(robot) + 1) + " - " +
                        robot.getPosition().x + "," +
                        robot.getPosition().y + "," +
                        robot.getDirection().toString() + "\n");

                break;
            }
        }

        output.append("Active Robot(s): " + robots.size() + "\n");
        System.out.println(output.toString());
    }
}
