package de.telran.game.state;

public class LevelDifficultySuperEasy extends AbstractGameState {

    private int numberOfTriesToGuessWord = 2;

    private int numberOfGuessedLettersInRow = 0;

    public LevelDifficultySuperEasy() {
        super();
        numberOfTries = 5;
    }

    @Override
    public void playerGuessedWrong() {
        numberOfTriesToGuessWord--;
        if (numberOfTriesToGuessWord == 0)
            playerLost();
    }

    @Override
    public void playerGuessedWordAndWon() {
        playerWon = true;
        points += 100;
    }

    @Override
    public void guessedLetter() {
        super.guessedLetter();
        numberOfGuessedLettersInRow++;
        if (numberOfGuessedLettersInRow % 3 == 0)
            points += 300;
    private int numberOfTriesToGuessAWord = 2;
    private boolean triedToGuessLetter = false;

    @Override
    public void playerGuessedWordAndWon() {

    }

    @Override
    public void guessedLetterWrong() {
        super.guessedLetterWrong();
        numberOfGuessedLettersInRow = 0;
        numberOfTries = getNumberOfTries() + 2;
        do {
            super.guessedLetterWrong();
        }
        while (numberOfTries >= 0 && triedToGuessLetter);
    }
}
