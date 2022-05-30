# Maze Crawler

### Purpose
To provide a symbol terminal game that gives the player a maze to solve.
Simple command line inputs will be sent to the terminal that allow the player
to move their icon through maze, with walls they can't cross and deadends.

### Tasks
- [x] Generate main game loop
- [x] Generate 2D Array that represents the game map and print to screen
- [x] Move player by translating icon to different array points
- [x] Prevent player from overriding walls
- [x] Prevent player from moving outside of map bounds
- [x] Check win condition based on final coordinates.

### Notes
So prior to this, I followed a tutorial on how to create a simple tic-tac-toe game
in java, which set some of the baseline for how this game would be created. I 
ultimately wanted to try something that was a little more complicated than that,
relying on the player to remain in bounds, have multiple directions they could go,
and so on. Some stuff I learned:
- Better control of 2D arrays
- Printing 2D arrays out in sequence
- controlling player inputs with switch cases
- Providing boundaries for the game board
- Creating win conditions that can be repeatably checked
- Using chars and unicode characters for fun
