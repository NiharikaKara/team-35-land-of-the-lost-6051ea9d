package com.levelup.forestsandmonsters;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

    @Test
    public void InitializationCreatesResults() {
        Position testObj = new Position(10,8);
        Assert.assertNotNull(testObj);
        Assert.assertNotNull(testObj.xCoordinate);
        Assert.assertNotNull(testObj.yCoordinate);
    }
}
