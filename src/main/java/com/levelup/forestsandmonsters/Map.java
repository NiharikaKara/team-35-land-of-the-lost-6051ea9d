package com.levelup.forestsandmonsters;

public class Map {
    
    public int[] move(int[] position) {
        if(position[0] < 0 || position[1] < 0)
        {
            return new int[]{0,0};
        }

        return position;
    }
}
