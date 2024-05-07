class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || (stack.pop() != getMatchingParentheses(ch))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private char getMatchingParentheses(char parentheses) {
        switch (parentheses) {
            case ')' :
                return '(';
            case '}' :
                return '{';
            case ']' :
                return '[';
            default :
                return ' ';
        }   
    }
}