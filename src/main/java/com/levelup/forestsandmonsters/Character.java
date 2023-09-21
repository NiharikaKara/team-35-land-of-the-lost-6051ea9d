package com.levelup.forestsandmonsters;

public class Character {
    static String DEFAULT_CHARACTER_NAME = "Character";
    private String name;

    public Character() {
        name = Character.DEFAULT_CHARACTER_NAME;
    }

    public Character(String name)
    {
        name = this.name;
    }

    public String getName()
    {
        return this.name;
    }

}
