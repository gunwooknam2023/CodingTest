package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P15815_천재_수학자_성필 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch[] = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();

        for(char c : ch){
            if(Character.isDigit(c)){
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else{
                int b = stack.pop();
                int a = stack.pop();

                switch(c){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                }
            }
        }
        System.out.println(stack.peek());
    }
}
