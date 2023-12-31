package com.levelup.forestsandmonsters;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Map {
    public int size;
    private List<Point> tiles = new ArrayList<>();
    
    public Map(int columns, int rows) {
        
        for(int x=0; x<columns; x++) {
            for (int y=0; y<rows; y++) {
                this.tiles.add(new Point(x,y));
            }
        }

        this.size = tiles.size();
    }

    public boolean isValidPosition(Point checkValue) {
        return this.tiles.contains(checkValue);
    }
    

    public Point move(Point oldPosition, Point newPosition) {
        if(!this.isValidPosition(newPosition)) {
            return oldPosition;        
        }

        return newPosition;
    }
}
