package de.telran.game;
import de.telran.game.state.*;


public class LevelChanger {
    Level level;
    GameState gameState = null;

    public LevelChanger(Level level){
        this.level = level;
    }

    public void difficultyLevel(){
        while (gameState == null) {
            switch (level) {
                case EASY:
                    System.out.println("You change easy");
                    gameState = new LevelDifficultySuperEasy();
                    break;
                case MEDIUM:
                    System.out.println("You change medium");
                    gameState = new LevelDifficultyEasy();
                    break;
                case HARD:
                    System.out.println("You change hard");
                    gameState = new LevelDifficultyHard();
                    break;
                default:
                    System.out.println("You entered the wrong difficulty level. Please try again.");
            }
        }
        Game game = new Game(gameState);
        game.startNewGame();
    }

}
