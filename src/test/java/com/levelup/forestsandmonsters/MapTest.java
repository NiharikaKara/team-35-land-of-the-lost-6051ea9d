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
        
        Point oldPosition = new Point(0, 0);
        Point newPosition = new Point(0, 1);

        Point returnPosition = map.move(oldPosition, newPosition);

        assertEquals(newPosition, returnPosition);
    }

    @Test
    public void test_map_bad_move() {
        Map map = new Map(10,10);
        
        Point positionBadX = new Point(-1, 0);
        Point positionBadY = new Point(0, -1);
        Point oldPosition = new Point(0, 0);

        Point returnPositionX = map.move(oldPosition, positionBadX);
        Point returnPositionY = map.move(oldPosition, positionBadY);

        assertEquals(oldPosition, returnPositionX);
        assertEquals(oldPosition, returnPositionY);
    }
}
