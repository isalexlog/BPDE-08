package de.telran;

public enum Level {

    HIGH(3, "This is very difficult level"),
    MEDIUM(2, "This is not so difficult level"),
    LOW(1, "This is easiest level youn can imagine");

    public static Level getLevelByLevelCode(int levelCode){
        for(Level level: Level.values()){
            if(level.getLevelCode() == levelCode)
                return level;
        }
        return null;
    }
    private final int level;
    private final String levelDescription ;

    Level(int level, String levelDescription) {
        this.level = level;
        this.levelDescription = levelDescription;
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
            default:
                System.out.println("You entered the wrong difficulty level. Please try again.");
        }
    }
}
