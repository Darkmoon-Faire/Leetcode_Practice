/**
 * leetcode 20
 */

import java.util.Stack;

/**
 * 左括号入栈，右括号出栈，当栈顶元素不匹配时候匹配失败，匹配看下栈是否为空，
 * 不空的话匹配失败
 */
public class Solution {
    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                System.out.println(stack.toString());
                char topChar = stack.pop();
                if (c == ')' && topChar != '(')
                    return false;
                if (c == ']' && topChar != '[')
                    return false;
                if (c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()";
        System.out.println(solution.isValid(s));
    }
}
