# Battleship Game

This project implements a simplified version of the classic Battleship game in Java. The game consists of two main classes:

1. **Board.java**: This class represents the game board. It includes methods for initializing the board, adding ships, checking for ship presence, shooting at squares, and determining if the game is over.

2. **MainBattleship.java**: This class contains the main method and handles the game logic. It allows players to interact with the game by adding ships, viewing the board, and shooting at squares.

## How to Play

To play the game, follow these steps:

1. **Compile**: Compile both `Board.java` and `MainBattleship.java` using a Java compiler.
2. **Run**: Run the `MainBattleship` class.
3. **Add Ships**: Type "a" to add a new ship. You will be prompted to input the starting row, starting column, length, and orientation (horizontal or vertical) of the ship.
4. **View Board**: Type "b" to see the current state of the game board.
5. **Play**: Type "p" to start the game once ships of lengths 3 and 4 have been added.
6. **Shoot**: During the game, type "s" to shoot at a specific square. You will be prompted to input the row and column coordinates.
7. **Quit**: At any time, type "q" to quit the game.

## Gameplay Rules

- Ships are represented by "b" (for battleship) on the board.
- Misses are represented by "m" on the board.
- Hits are represented by "x" on the board.
- The game is over when all ships have been sunk.

Enjoy playing Battleship!
