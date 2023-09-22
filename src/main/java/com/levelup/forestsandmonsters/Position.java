package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {  
    
    public int xCoordinate;
    public int yCoordinate;

    public Position(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Point getPoint() {
        return new Point(this.xCoordinate, this.yCoordinate);
    }
}
