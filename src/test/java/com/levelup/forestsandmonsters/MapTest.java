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
        
        int[] position = new int[]{0, 0};

        int[] returnPosition = map.move(position);

        assertArrayEquals(position, returnPosition);
    }

    @Test
    public void test_map_bad_move() {
        Map map = new Map();
        
        int[] positionBadX = new int[]{-1, 0};
        int[] positionBadY = new int[]{0, -1};
        int[] expectedPosition = new int[]{0, 0};

        int[] returnPositionX = map.move(positionBadX);
        int[] returnPositionY = map.move(positionBadY);

        assertArrayEquals(expectedPosition, returnPositionX);
        assertArrayEquals(expectedPosition, returnPositionY);
    }
}
