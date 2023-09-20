Feature: Move in a direction
I want to move my character. If they attempt to move past a boundary then it stays in the same position 

Scenario Outline: Move in direction
Given the character starts at position with XCoordinates <startingPositionX>
And starts at YCordinates <startingPositionY>
And the player's starting move count is <startingMoveCount>
And the player chooses to move in <direction>
When the character moves
Then Character is now at position with XCoordinates <endingPositionX>
And YCoordinates <endingPositionY>
Then the player's ending move count is <endingMoveCount>

Examples:
|startingPositionX|startingPositionY|startingMoveCount|direction|endingPositionX|endingPositionY|endingMoveCount|
 
|5|5|0|NORTH|4|5|1|
|5|5|1|SOUTH|6|5|2|
|5|5|2|EAST|5|6|3|
|5|5|3|WEST|5|4|4|

|0|0|1|NORTH|0|0|2|
|0|0|108|EAST|0|1|109|
|0|0|900|SOUTH|1|0|901|
|0|0|213|WEST|0|0|214|

|9|0|300|NORTH|8|0|301|
|9|0|32|SOUTH|9|0|33|
|9|0|1000|EAST|9|1|1001|
|9|0|0|WEST|9|0|1|

|0|9|45|NORTH|0|9|46|
|0|9|98|SOUTH|1|9|99|
|0|9|8|EAST|0|9|9|
|0|0|11|WEST|0|8|12|

|9|9|98|NORTH|8|9|99|
|9|9|97|SOUTH|9|9|98|
|9|9|46|EAST|9|9|47|
|9|9|23|WEST|9|8|24|