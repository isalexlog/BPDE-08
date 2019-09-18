package de.telran;

import de.telran.game.Game;
import de.telran.game.state.*;

import java.util.Scanner;
public class Main {

    /*
    HW:
    implement new difficulty level LevelDifficultySuperEasy:
    - 3 guessed letters in a row  - +300 points

    Possible features:
    - open any letter in the word
    - random number of points from predefined list (50, 100, 200, 300)
    - if there is more then 1 same guessed letter in the word,
    multiply points by number of the same guessed letters
     */

    public static void main(String[] args) {

        System.out.print("Please choose difficulty level (1 - easy, 2 - hard, 3 - super easy):");
        Scanner scanner = new Scanner(System.in);


        Level level = Level.getLevelByNumber(scanner.nextInt());
        Game game = new Game(level.gameState);
        game.startNewGame();

    }
}
