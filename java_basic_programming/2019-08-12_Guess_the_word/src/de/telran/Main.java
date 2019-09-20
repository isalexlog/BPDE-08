package de.telran;

import de.telran.game.*;
import de.telran.game.state.*;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.print("Please write selected difficulty level in UPPERCASE (easy, medium, hard):");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        LevelChanger level = new LevelChanger(Level.valueOf(str));
        level.difficultyLevel();

/*

        while (gameState == null) {
            switch (Level.values()) {
                case 1:
                    gameState = new LevelDifficultyEasy();
                    break;
                case 2:
                    gameState = new LevelDifficultyHard();
                    break;
                case 3:
                    gameState = new LevelDifficultySuperEasy();
                    break;
                default:
                    System.out.println("You entered the wrong difficulty level. Please try again.");
            }
        }*/



    }
}