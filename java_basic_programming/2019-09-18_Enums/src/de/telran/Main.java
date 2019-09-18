package de.telran;

public class Main {

    public static void main(String[] args) {

	    //Level level = Level.HIGH;
	    //System.out.println(level);
        Level level = Level.getLevelByNumber(1);

	    for(Level level: Level.values()){
            System.out.println(level);
            System.out.println("Level code = " + level.getLevelCode());

            System.out.println();
        }

    }
}
