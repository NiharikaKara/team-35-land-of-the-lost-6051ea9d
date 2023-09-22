package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Character";
    public Character character = new Character();
    public Map map = new Map(10, 10);

    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point startingPosition = null;
        public Point endingPosition = null;
        public int moveCount = 0;
    }

    public void updateCharacterPosition(Point coordinates) {

        }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
        }
        this.character.setName(status.characterName);
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
        Position position = new Position (4, 5);

        this.character.setPosition(position);
        this.status.characterName = this.character.getName();
        this.status.startingPosition = position.getPoint();
        this.status.endingPosition = position.getPoint();
        this.status.moveCount = 0;
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
    }

}
