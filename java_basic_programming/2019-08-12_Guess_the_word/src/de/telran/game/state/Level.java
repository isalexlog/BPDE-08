package de.telran.game.state;

public enum Level {

    HIGH(3, "This is very difficult level", new LevelDifficultyHard()),
    MEDIUM(2, "This is not so difficult level", new LevelDifficultyEasy()),
    LOW(1, "This is easiest level youn can imagine", new LevelDifficultySuperEasy());

    private final int level;
    private final String levelDescription;
    public final GameState gameState;

    Level(int level, String levelDescription, GameState gameState) {
        this.level = level;
        this.levelDescription = levelDescription;
        this.gameState = gameState;
    }

    public int getLevelCode(){
        return level;
    }

    public String getLevelDescription(){
        return levelDescription;
    }

    public static Level getLevelByNumber(int level){
        switch (level) {
            case 1:
                return Level.HIGH;
            case 2:
                return Level.MEDIUM;
            case 3:
                return Level.LOW;
        }
        return null;
    }
}
