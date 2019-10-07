package de.telran.stack;

public class Stack {
    public boolean checkParenthesesPairs(char[] chars) {

        java.util.Stack<Character> stackParenthesis = new java.util.Stack<Character>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') stackParenthesis.push(chars[i]);
            if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                if (stackParenthesis.empty()) return false;
                else if (!checkPairs(stackParenthesis.pop(), chars[i])) return false;
            }
        }
        if (stackParenthesis.size() != 0) return false;

        return true;
    }

    private boolean checkPairs(char char1, char char2) {
        if (char1 == '(' && char2 == ')') return true;
        if (char1 == '{' && char2 == '}') return true;
        if (char1 == '[' && char2 == ']') return true;
        return false;
    }


}
