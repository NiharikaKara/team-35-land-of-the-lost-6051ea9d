package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

public class MapTest {
    
    @Test
    public void test_map_init() {
        int columns = 10;
        int rows = 10;

        Map map = new Map(columns, rows);
        assertNotNull("Map object created", map);
        assertEquals((columns * rows), map.size);

        assertFalse(map.isValidPosition(new Point(-1,0)));
        assertFalse(map.isValidPosition(new Point(0,-1)));
        assertFalse(map.isValidPosition(new Point(10,0)));
        assertFalse(map.isValidPosition(new Point(0,10)));
        assertTrue(map.isValidPosition(new Point(0,0)));
        assertTrue(map.isValidPosition(new Point(0,9)));
        assertTrue(map.isValidPosition(new Point(9,0)));
        assertTrue(map.isValidPosition(new Point(9,9)));
    }

    @Test
    public void test_map_move() {
        Map map = new Map(10,10);
        
        int[] position = new int[]{0, 0};

        int[] returnPosition = map.move(position);

        assertArrayEquals(position, returnPosition);
    }

    @Test
    public void test_map_bad_move() {
        Map map = new Map(10,10);
        
        int[] positionBadX = new int[]{-1, 0};
        int[] positionBadY = new int[]{0, -1};
        int[] expectedPosition = new int[]{0, 0};

        int[] returnPositionX = map.move(positionBadX);
        int[] returnPositionY = map.move(positionBadY);

        assertArrayEquals(expectedPosition, returnPositionX);
        assertArrayEquals(expectedPosition, returnPositionY);
    }
}
