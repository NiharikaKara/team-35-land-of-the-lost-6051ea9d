package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import java.awt.Point;

public class Character {
    static String DEFAULT_CHARACTER_NAME = "Character";
    private String name;
    private Map gameMap = new Map(10, 10);
    private Position position;
    

    public Character() {
        name = Character.DEFAULT_CHARACTER_NAME;
    }

    public Character(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void enterMap(Map map) {
        this.gameMap = map;
    }

    public Position getPosition() {
        return this.position;

    }

    public void setPosition(Position characterPosition) {
        this.position = characterPosition;
    }

    public void move(DIRECTION direction)
    {
               Position newPosition = new Position(-1, -1);

      switch(direction)    
      {        
        case NORTH:
            newPosition.yCoordinate = this.position.yCoordinate-1;
            newPosition.xCoordinate = this.position.xCoordinate;
             break;
        case SOUTH:
              newPosition.yCoordinate = this.position.yCoordinate+1;
               newPosition.xCoordinate = this.position.xCoordinate;
             break;    
        case WEST:
              newPosition.yCoordinate = this.position.yCoordinate;
             newPosition.xCoordinate = this.position.xCoordinate-1;
             break;
        case EAST:
             newPosition.yCoordinate = this.position.yCoordinate;
            newPosition.xCoordinate = this.position.xCoordinate+1;
             break;
        default:
             newPosition.yCoordinate = this.position.yCoordinate;
             newPosition.xCoordinate = this.position.xCoordinate;
             break;
      } 
    
     Point point = gameMap.move(new Point(this.position.xCoordinate, this.position.yCoordinate), new Point(newPosition.xCoordinate, newPosition.yCoordinate));  
     
     this.setPosition(new Position(point.x, point.y));
    }
}