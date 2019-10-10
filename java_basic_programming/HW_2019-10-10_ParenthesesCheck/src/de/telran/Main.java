package de.telran;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";
        Stack st = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (!st.empty() && ((str.charAt(i) == ']' && st.peek().equals('[')) ||
                    (str.charAt(i) == '}' && st.peek().equals('{')) ||
                    (str.charAt(i) == ')' && st.peek().equals('(')))) {

                st.pop();

            } else {
                st.push(str.charAt(i));
            }
        }

        if(st.empty()) {
            System.out.println("Pair-wise closed");
        } else {
            System.out.println("Not pair-wise closed");
        }
    }
}
