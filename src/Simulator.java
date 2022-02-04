
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import command.*;
import controller.*;
import object.*;

public class Simulator {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Robot> robots = new ArrayList<>();
        String nextCommand;

        while (true) {
            nextCommand = bufferedReader.readLine();
            if (nextCommand != null) {
                String[] commands = nextCommand.split(" ");
                if (RobotCommand.valueOf(commands[0]) == RobotCommand.PLACE) {
                    robots.add(new Robot(commands[1]));
                } else if (RobotCommand.valueOf(commands[0]) == RobotCommand.REPORT) {

                } else if (RobotCommand.valueOf(commands[0]) == RobotCommand.ROBOT) {
                    for (Robot robot : robots) {
                        robot.switchStatus(false);
                    }
                    robots.get(Integer.parseInt(commands[1])).switchStatus(true);
                } else if (Action.valueOf(commands[0]) == Action.LEFT) {

                } else if (Action.valueOf(commands[0]) == Action.RIGHT) {

                } else if (Action.valueOf(commands[0]) == Action.MOVE) {

                }
                // robots.add(new Robot(x, y, direction))
                System.out.println(nextCommand.split(" ")[0]);
            } else {
                break;
            }
        }

        bufferedReader.close();

    }
}
