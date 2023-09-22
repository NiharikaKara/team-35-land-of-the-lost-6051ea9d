package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class CharacterTest {

    @Test
    public void validateDefaultCharacterName()
    {
    Character character = new Character();
    Assert.assertEquals(character.getName(), character.DEFAULT_CHARACTER_NAME);
    }

    @Test
    public void validateCharacterName() 
    {
       String val = "JimBob";
        Character character = new Character("JimBob");
        Assert.assertEquals(character.getName(), val);
    }

    @Test
    public void initializeMap() {
        Map gameMap = new Map(10,10); 
        Character character = new Character();
        assertNotNull(gameMap);
        gameMap.move(new )
    }

    @Test
    public void validatePosition() {
        Character character = new Character();
        Position position = new Position(3,2);
        character.setPosition(position);
        assertEquals(character.getPosition(), position);
    }

    @Test
    public void validateMove() {
        Character character = new Character();
        int xCoordinate = 2;
        int yCoordinate = 2;
        Position position = new Position(xCoordinate, yCoordinate);
        character.setPosition(position);
        character.move(DIRECTION.NORTH);
        assertEquals((yCoordinate-1), character.getPosition().yCoordinate);
        assertEquals(xCoordinate, character.getPosition().xCoordinate);

    }

     @Test
    public void validateMovement() {
        Character character = new Character();
        Map gameMap = new Map(10, 10);
        int xCoordinate = 0;
        int yCoordinate = 0;
        Position position = new Position(xCoordinate, yCoordinate);
        character.setPosition(position);
        Position oldPosition = character.getPosition();
        character.move(DIRECTION.NORTH);
        Position newPosition = character.getPosition();
        Assert.assertEquals(newPosition.xCoordinate, xCoordinate);
        Assert.assertEquals(newPosition.yCoordinate, yCoordinate);
    }
    
}
