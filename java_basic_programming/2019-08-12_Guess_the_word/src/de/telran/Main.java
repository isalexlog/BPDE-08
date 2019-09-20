package de.telran;

import de.telran.game.Game;
import de.telran.game.state.*;

import java.util.Objects;
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

        System.out.print("Please choose difficulty level (1 - super easy, 2 - easy, 3 - hard):");
        Scanner scanner = new Scanner(System.in);

        GameState gameState = null;

        while (gameState == null) {
            switch (scanner.nextInt()) {
                case 1:
                    gameState = new LevelDifficultySuperEasy();
                    System.out.println(DifficultyLevel.getLevelDescriptionByLevelCode(1));
                    break;
                case 2:
                    gameState = new LevelDifficultyEasy();
                    System.out.println(DifficultyLevel.getLevelDescriptionByLevelCode(2));
                    break;
                case 3:
                    gameState = new LevelDifficultyHard();
                    System.out.println(DifficultyLevel.getLevelDescriptionByLevelCode(3));
                    break;
                default:
                    System.out.println("You entered the wrong difficulty level. Please try again.");
            }
        }

        Game game = new Game(gameState);
        game.startNewGame();

    }
}
