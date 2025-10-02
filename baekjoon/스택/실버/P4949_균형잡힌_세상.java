package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949_균형잡힌_세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String st = br.readLine();
            if(st.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean vaild = true;

            for(char ch : st.toCharArray()){
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                } else if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else{
                        vaild = false;
                        break;
                    }
                } else if(ch == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else{
                        vaild= false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) vaild = false;
            sb.append(vaild ? "yes" : "no").append('\n');
        }
        System.out.println(sb);
    }
}
