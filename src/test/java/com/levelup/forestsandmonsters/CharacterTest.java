package com.levelup.forestsandmonsters;

import org.junit.Assert;

public class CharacterTest {

    public void testDefaultCharacterName()
    {
    Character character = new Character();
    Assert.assertEquals(character.getName(), character.DEFAULT_CHARACTER_NAME);
    }

    public void testCharacterName(String val) 
    {
        Character character = new Character("JimBob");
        Assert.assertEquals(character.getName(), val);
    }

    
}
