package object;

import java.awt.Point;

import command.*;
import controller.*;

public class Robot {
    private Point position;
    private Direction direction;
    private boolean status;

    public Robot(String command) {
        String[] robotInfo = command.split(",");
        this.position.x = Integer.parseInt(robotInfo[0]);
        this.position.y = Integer.parseInt(robotInfo[1]);
        this.direction = Direction.valueOf(robotInfo[2]);
    }

    public void processCommand() {

    }

    private void switchDirection(Action action) {
        this.direction = DirectionController.switchDirection(getDirection(), action);

    }

    private void move() {
        this.position = MovementController.move(getPosition(), getDirection());
    }

    public void switchStatus(boolean status) {
        this.status = status;
    }

    public Point getPosition() {
        return this.position;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public boolean getStatus() {
        return this.status;
    }

}
