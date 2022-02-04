package controller;

import java.awt.Rectangle;
import java.awt.Point;
import command.Direction;

public class MovementController {
    private static Rectangle tabletop = new Rectangle(0, 0, 5, 5);

    public MovementController() {

    }

    public static boolean isInside(Point position) {
        return tabletop.contains(position);
    }

    public static Point move(Point position, Direction direction) {
        Point newPosition = position;

        if (direction == Direction.EAST) {
            newPosition.x = position.x + 1;
            return newPosition;
        } else if (direction == Direction.NORTH) {
            newPosition.y = position.y + 1;
            return newPosition;
        } else if (direction == Direction.WEST) {
            newPosition.x = position.x - 1;
            return newPosition;
        } else if (direction == Direction.SOUTH) {
            newPosition.y = position.y - 1;
            return newPosition;
        }
        return null;
    }
}
