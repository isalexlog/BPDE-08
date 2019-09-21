package de.telran.game;

import de.telran.game.state.LevelDifficultyEasy;
import de.telran.game.state.LevelDifficultyHard;
import de.telran.game.state.LevelDifficultySuperEasy;

public enum LevelEnum {
    SUPER_EASY(
            1,
            "This is the easiest level",
            LevelDifficultySuperEasy.class
    ),
    EASY(
            2,
            "This is second level",
            LevelDifficultyEasy.class),
    HARD(
            3,
            "This is hardest level",
            LevelDifficultyHard.class
    );

    public static LevelEnum getLevelByLevelCode(int levelCode) throws WrongLevelCodeException {
        for (LevelEnum level: LevelEnum.values()) {
            if (level.getLevelCode() == levelCode)
                return level;
        }
        throw new WrongLevelCodeException(levelCode);
    }

    private final int levelCode;
    private final String description;
    private final Class clazz;

    LevelEnum(int levelCode, String description, Class clazz) {
        this.levelCode = levelCode;
        this.description = description;
        this.clazz = clazz;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public String getDescription() {
        return description;
    }

    public Class getClazz() {
        return clazz;
    }
}
