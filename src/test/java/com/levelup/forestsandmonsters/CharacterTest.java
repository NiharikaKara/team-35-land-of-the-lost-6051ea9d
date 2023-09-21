package com.levelup.forestsandmonsters;

import org.junit.Assert;
import org.junit.Test;

public class CharacterTest {

    @Test
    public void testDefaultCharacterName()
    {
    Character character = new Character();
    Assert.assertEquals(character.getName(), character.DEFAULT_CHARACTER_NAME);
    }

    @Test
    public void testCharacterName(String val) 
    {
        Character character = new Character("JimBob");
        Assert.assertEquals(character.getName(), val);
    }

    
}
