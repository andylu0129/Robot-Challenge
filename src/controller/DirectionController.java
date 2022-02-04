package controller;

import command.*;

public class DirectionController {

    public DirectionController() {

    }

    public static Direction switchDirection(Direction direction, Action action) {
        int degree = direction.degree;

        // change the direction facing according to the action
        if (action == Action.LEFT) {
            degree += Action.LEFT.value;
        } else if (action == Action.RIGHT) {
            degree += Action.RIGHT.value;
        }
        degree = normalizeDegree(degree);

        return Direction.valueOf(degree);
    }

    private static int normalizeDegree(int degree) {
        int minDegree = 0;
        int maxDegree = 360;

        // Ensures that the degree falls inside 0 and 360
        while (true) {
            if (degree < minDegree) {
                degree += maxDegree;
            } else if (degree >= maxDegree) {
                degree -= maxDegree;
            } else if (degree >= minDegree && degree < maxDegree) {
                break;
            }

        }

        return degree;
    }

}
