package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773_실버_IV {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<K; i++){
            int cur = Integer.parseInt(br.readLine());

            if(!stack.isEmpty() && cur == 0){
                stack.pop();
            } else{
                stack.push(cur);
            }
        }

        int answer = 0;
        for(int a : stack){
            answer += a;
        }
        System.out.println(answer);
    }
}
