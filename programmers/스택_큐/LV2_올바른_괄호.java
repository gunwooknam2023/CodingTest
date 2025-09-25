package 스택_큐;

import java.util.Stack;

public class LV2_올바른_괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
