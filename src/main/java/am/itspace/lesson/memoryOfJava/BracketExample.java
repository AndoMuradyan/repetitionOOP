package am.itspace.lesson.memoryOfJava;

import java.util.Stack;

public class BracketExample {

    public static void main(String[] args) {
        String s = "{{}[()]{[]}}";
        System.out.println(isCorrect(s));
    }

    private static boolean isCorrect(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            if (e == '(' || e == '[' || e == '{') {
                stack.push(e);
                continue;
            }
            switch (e) {
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
