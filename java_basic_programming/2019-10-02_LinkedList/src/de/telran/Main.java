package de.telran;

import java.util.Stack;

public class Main {
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
    static class Parenthesis {
        private char parent;

        public Parenthesis(char par, int i) {
            this.parent = par;
        }
    }
    public static void main(String[] args) {
        String data = "(()){{[[[[]]]}{}[[]]))[[(()))]]";
        char[] chars = data.toCharArray();

        Stack<Parenthesis> s = new Stack<Parenthesis>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                s.push(new Parenthesis('(', i + 1));
            } else if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
                if (!s.isEmpty()) {
                    s.pop();
                } else {
                    System.out.println(data.charAt(i));
                    return;
                }
            }
            if (!s.isEmpty()) {
                System.out.println(s.pop() + "is correct");
            } else {
                System.out.println(data.charAt(i));
                return;
            }
        }

    }
}