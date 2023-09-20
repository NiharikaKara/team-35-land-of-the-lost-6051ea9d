Feature: Move in a direction
I want to move my character. If they attempt to move past a boundary then it stays in the same position 

Scenario Outline: Move in direction
Given the character starts at position with XCoordinates <startingPositionX>
And starts at YCordinates <startingPosition>
And the player chooses to move in <direction>
When the character moves
Then Character is n ow at position with XCoordinates <endingPositionX>
And YCoordinates <endingPositionY> 

Examples:
|startingPositionX|startingPositionY|direction|endingPositionX|endingPositionY|
|0|0|NORTH|0|1|
|0|0|SOUTH|0|0|