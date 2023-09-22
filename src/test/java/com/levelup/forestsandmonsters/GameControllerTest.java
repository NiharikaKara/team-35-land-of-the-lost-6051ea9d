package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import java.awt.Point;

public class GameControllerTest {
    @Test
    public void InitializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }


    @Test
    public void ValidateGameStatusResults() {
        GameController testObj = new GameController();
        String val = "JimBob";
        Point startingPosition = new Point (0,0);
        Point endingPosition = new Point (0,0);
        int moveCount = 0;
        testObj.getStatus().characterName = val;
        testObj.getStatus().startingPosition = startingPosition;
        testObj.getStatus().endingPosition = endingPosition;
        testObj.getStatus().moveCount = moveCount;
        Assert.assertNotNull(testObj.getStatus().characterName);
        Assert.assertNotNull(testObj.getStatus().startingPosition);
        Assert.assertNotNull(testObj.getStatus().endingPosition);
        Assert.assertNotNull(testObj.getStatus().moveCount);
        Assert.assertEquals(val, testObj.getStatus().characterName);
        Assert.assertEquals(startingPosition, testObj.getStatus().startingPosition);
        Assert.assertEquals(endingPosition, testObj.getStatus().endingPosition);
        Assert.assertEquals(moveCount, testObj.getStatus().moveCount);
    }

     @Test
    public void ValidateUpdateCharacterPosition() {


    }

    @Test
    public void ValidateCharacterName() {
        GameController testObj = new GameController();
        String val = "JimBob";
        testObj.createCharacter(val);
        Assert.assertEquals(val, testObj.character.getName());
    }

}
