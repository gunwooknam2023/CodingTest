package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P3986_좋은_단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=0; i<N; i++){
            String st = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(char ch : st.toCharArray()){
                if(!stack.isEmpty() && stack.peek() == ch){
                    stack.pop();
                } else{
                    stack.push(ch);
                }
            }
            if(stack.isEmpty()) result++;
        }
        System.out.println(result);
    }
}
