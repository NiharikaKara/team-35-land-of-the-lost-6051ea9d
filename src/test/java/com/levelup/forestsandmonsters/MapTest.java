package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MapTest {
    @Test
    public void test_map_init() {
        Map map = new Map();
        assertNotNull("Map object created", map);
    }

    @Test
    public void test_map_move() {
        Map map = new Map();
        int xCoordinate = 0;
        int yCoordinate = 0;

        int[] returnPosition = map.move(xCoordinate, yCoordinate);

        assertArrayEquals(new int[]{xCoordinate, yCoordinate}, returnPosition);
    }
}
