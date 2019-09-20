package de.telran.game.state;

public enum DifficultyLevel {
    SUPEREASY(1,"Very easy level of difficulty"),
    EASY(2,"Easy level of difficulty"),
    HARD(3,"Hard level of difficulty");

    private final int levelCode;
    private final String levelDescription;

    DifficultyLevel(int levelCode, String levelDescription) {
        this.levelCode = levelCode;
        this.levelDescription = levelDescription;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getLevelDescription() {
        return levelDescription;
    }

    public static String getLevelDescriptionByLevelCode(int levelCode) {
        for (DifficultyLevel level : DifficultyLevel.values()) {
            if (level.getLevelCode() == levelCode)
                return level.getLevelDescription();
        }
        return null;
    }
}
