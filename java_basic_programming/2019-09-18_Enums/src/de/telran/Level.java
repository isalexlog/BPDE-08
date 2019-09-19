package de.telran;

public enum Level {
    HIGH(3, "This is very difficult level"),
    MEDIUM(2, "This is not so difficult level"),
    LOW(1, "This is easiest level you can imagine");

    public static Level getLevelByLevelCode(int levelCode) {
        for (Level level: Level.values()) {
            if (level.getLevelCode() == levelCode)
                return level;
        }
        return null;
    }

    private final int level;
    private final String levelDescription;

    Level(int level, String levelDescription) {
        this.level = level;
        this.levelDescription = levelDescription;
    }

    public int getLevelCode() {
        return this.level;
    }

    public String getLevelDescription() {
        return this.levelDescription;
    }
}
