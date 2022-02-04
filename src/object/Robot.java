package object;

import java.awt.Point;

import command.*;
import controller.*;

public class Robot {
    private Point position;
    private Direction direction;
    private boolean active;

    public Robot(String command) {
        String[] robotInfo = command.split(",");
        this.position = new Point(Integer.parseInt(robotInfo[0]), Integer.parseInt(robotInfo[1]));
        this.direction = Direction.valueOf(robotInfo[2]);
        this.active = false;
    }

    public void handleCommand(Action action) {
        if (action == Action.MOVE) {
            move();
        } else {
            switchDirection(action);
        }
    }

    private void switchDirection(Action action) {
        this.direction = DirectionController.switchDirection(getDirection(), action);

    }

    private void move() {
        this.position = MovementController.move(getPosition(), getDirection());
    }

    public void switchStatus(boolean status) {
        this.active = status;
    }

    public Point getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public boolean isActive() {
        return this.active;
    }

}
