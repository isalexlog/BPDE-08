package de.telran.stack;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
    HW: parentheses task: check the correctness of the following
    parentheses expression (use stack):
    (())
    {{[[[[]]]}{}[[]]))
    [[(()))]]
    etc.
    Correctness means that parentheses have to be pairly closed:
    [({})] - this is correct
    [([) - incorrect expression
     */

public class StackTest {

    private Stack stack = new Stack();


    @Test
    public void checkParenthesesPairsCorrect() {
        char[] parenthesis = {'[', '(', '{', '}', ')', ']'};
        assertTrue(stack.checkParenthesesPairs(parenthesis));
    }

    @Test
    public void checkParenthesesPairsIncorrect() {
        char[] parenthesis = {'[', '(', '[', ')'};
        assertFalse(stack.checkParenthesesPairs(parenthesis));
    }

    @Test
    public void checkParenthesesPairsFirstClosing() {
        char[] parenthesis = {')', '[', '(', '[', ')'};
        assertFalse(stack.checkParenthesesPairs(parenthesis));
    }

    @Test
    public void checkParenthesesPairsLastOpening() {
        char[] parenthesis = {'[', '(', '{', '}', ')', ']', '('};
        assertFalse(stack.checkParenthesesPairs(parenthesis));
    }

    @Test
    public void checkParenthesesPairsOne() {
        char[] parenthesis = {'['};
        assertFalse(stack.checkParenthesesPairs(parenthesis));
    }

    @Test
    public void checkParenthesesPairsCorrectWithLetters() {
        char[] parenthesis = {'[', '(', '{', 'e', '}', ')', ']'};
        assertTrue(stack.checkParenthesesPairs(parenthesis));
    }


}


