package controller;

import java.awt.Rectangle;
import java.awt.Point;
import command.Direction;

public class MovementController {
    public static final Rectangle tabletop = new Rectangle(0, 0, 5, 5);

    public MovementController() {

    }

    public static boolean isInside(Point position) {
        return tabletop.contains(position);
    }

    public static Point move(Point position, Direction direction) {
        Point newPosition = new Point(position.x, position.y);

        if (direction == Direction.EAST) {
            newPosition.x = position.x + 1;
        } else if (direction == Direction.NORTH) {
            newPosition.y = position.y + 1;
        } else if (direction == Direction.WEST) {
            newPosition.x = position.x - 1;
        } else if (direction == Direction.SOUTH) {
            newPosition.y = position.y - 1;
        }
        if (isInside(newPosition)) {
            return newPosition;
        }
        return position;
    }
}
