
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Object;

import command.*;
import controller.*;
import object.*;

public class Simulator {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Robot> robots = new ArrayList<>();
        Robot activeRobot = null;
        String nextCommand;

        while ((nextCommand = bufferedReader.readLine()) != null) {
            String[] commands = nextCommand.split(" ");

            // Handles PLACE
            if (commands[0].equals(RobotCommand.PLACE.toString())) {
                Robot newRobot = new Robot(commands[1]);
                // First robot placed inside table is active by default.
                if (robots.isEmpty()) {
                    activeRobot = newRobot;
                    newRobot.switchStatus(true);
                }
                if (MovementController.isInside(newRobot.getPosition())) {
                    robots.add(newRobot);
                }

            }
            // Handles REPORT command
            else if (commands[0].equals(RobotCommand.REPORT.toString())) {
                Report report = new Report();
                report.printReport(robots);
            }
            // Handles ROBOT command
            else if (commands[0].equals(RobotCommand.ROBOT.toString())) {
                // Set each robot to inactive and the specified one to active.
                for (Robot robot : robots) {
                    robot.switchStatus(false);
                }
                robots.get(Integer.parseInt(commands[1]) - 1).switchStatus(true);
                activeRobot = robots.get(Integer.parseInt(commands[1]) - 1);

            }
            // Handles LEFT, RIGHT, and MOVE commands by checking whether the current
            // command is in Action enum
            else if (Action.contains(commands[0])) {
                if (activeRobot != null) {
                    activeRobot.handleCommand(Action.valueOf(commands[0]));
                }
            }
        }
        bufferedReader.close();

    }
}
