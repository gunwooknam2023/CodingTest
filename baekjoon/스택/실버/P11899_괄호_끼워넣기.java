package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P11899_괄호_끼워넣기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String st = br.readLine();

        for(char ch : st.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else{
                    stack.push(ch);
                }
            }
        }
        System.out.println(stack.size());
    }
}
