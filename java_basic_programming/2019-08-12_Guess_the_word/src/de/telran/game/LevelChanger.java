package de.telran.game;
import de.telran.game.state.*;


public class LevelChanger {
    Level level;
    GameState gameState = null;

    public LevelChanger(Level level){
        this.level = level;
    }

    public void difficultyLevel(){
        switch (level){
            case easy:
                System.out.println("You change easy");
                gameState = new LevelDifficultySuperEasy();
                break;
            case medium:
                System.out.println("You change medium");
                gameState = new LevelDifficultyEasy();
                break;
            case hard:
                System.out.println("You change hard");
                gameState = new LevelDifficultyHard();
                break;
            default:
                System.out.println("We have not level.");
                break;


        }
        Game game = new Game(gameState);
        game.startNewGame();
    }

}
