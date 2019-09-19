package de.telran;

/*
    HW: review code of Guess the word project,
    replace difficulty levels switch/case by enums,
    store in the enum members the main differences between
    difficulty levels.
    Create pull request and send it!
 */

public class Main {

    public static void main(String[] args) {

        for (Level level: Level.values()) {
            System.out.println(level);
        }

        Level level = Level.valueOf("LOW");
        System.out.println("Level=" + level);
        System.out.println("Level code = " + level.getLevelCode());

        System.out.print(Level.getLevelByLevelCode(3));
    }
}
