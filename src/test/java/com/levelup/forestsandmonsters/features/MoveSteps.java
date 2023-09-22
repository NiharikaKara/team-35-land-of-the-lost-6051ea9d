package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {
    GameController gc;
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
    public void givenTheCharactersStartsAtX(int startX) {
        this.startX = startX;
    }

    @Given("starts at YCoordinates {int}")
    public void givenTheCharactersStartsAtY(int startY) {
        this.startY = startY;
    }

    @Given("the player chooses to move in {word}")
    public void givenPlayerChoosesDirection(String direction) {
        this.direction = GameController.DIRECTION.valueOf(direction);
    }

    @When("the character moves")
    public void theCharacterMoves() {
        gc = new GameController();
        gc.setCharacterPosition(new Point(this.startX, this.startY));
        gc.move(this.direction);
        GameController.GameStatus status = gc.getStatus();
        this.currentPosition = status.endingPosition;
    }
    
    @Then("the character is now at position with XCoordinates {int}")
    public void checkXCoordinates(int endX) {
        assertNotNull("Expected position not null", this.currentPosition);
        assertEquals(endX, this.currentPosition.x);
    }

    @Then("YCoordinates {int}")
    public void checkYCoordinates(int endY) {
        assertNotNull("Expected position not null", this.currentPosition);
        assertEquals(endY, this.currentPosition.y);
    }

    @Given("the player's starting move count is {int}")
public void the_player_s_starting_move_count_is(Integer count) {
    // Write code here that turns the phrase above into concrete actions
    // gc.setMoveCount(count);  
    // Integer moveCount = gc.getMoveCount();
    // assertNotNull("Expected moveCount not null", moveCount);
    // assertEquals(count, moveCount);  

}

@Then("the player's ending move count is {int}")
public void the_player_s_ending_move_count_is(Integer count) {
    // Write code here that turns the phrase above into concrete actions
    // Integer moveCount = gc.getMoveCount();
    // assertNotNull("Expected moveCount not null", moveCount);
    // assertEquals(count, moveCount);

}

}
