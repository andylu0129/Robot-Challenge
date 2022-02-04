> **:warning: Please don't fork this repo.**

***

The starting point of this Java program is in `Simulator` class. Note that the program will run until a `SIGKILL`.

## Test Cases

All test cases provided from the original challenge page and the following can be tested by copying and pasting into the terminal.

a)

    PLACE 5,4,NORTH
    PLACE 2,2,WEST
    MOVE
    MOVE
    LEFT
    MOVE
    LEFT
    LEFT
    MOVE
    MOVE
    RIGHT
    REPORT

    Output: ROBOT 1 - 0,3,EAST
    Active Robot(s): 1

b)

    PLACE 1,3,EAST
    MOVE
    MOVE
    RIGHT
    PLACE 0,2,SOUTH
    ROBOT 2
    LEFT
    REPORT

    Output: ROBOT 2 - 0,2,EAST
    Active Robot(s): 2

c)

    PLACE 4,4,SOUTH
    MOVE
    PLACE 3,2,NORTH
    ROBOT 2
    MOVE
    MOVE
    MOVE
    LEFT
    MOVE
    MOVE
    MOVE
    REPORT

    Output: ROBOT 2 - 0,4,WEST
    Active Robot(s): 2

d)
    
    PLACE 1,2,SOUTH
    PLACE 2,4,NORTH
    PLACE 3,3,WEST
    PLACE 0,0,EAST
    ROBOT 4
    MOVE
    LEFT
    MOVE
    PLACE 2,2,NORTH
    ROBOT 5
    MOVE
    MOVE
    RIGHT
    REPORT

    Output: ROBOT 5 - 2,4,EAST
    Active Robot(s): 5
