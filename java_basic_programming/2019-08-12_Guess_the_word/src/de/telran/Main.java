package de.telran;

import de.telran.game.Game;
import de.telran.game.state.*;

import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        System.out.print("Please choose difficulty level (1 - easy, 2 - hard, 3 - super easy):");
        Scanner scanner = new Scanner(System.in);


        Level level = Level.getLevelByNumber(scanner.nextInt());
        Game game = new Game(level.gameState);
        game.startNewGame();

    }
}
