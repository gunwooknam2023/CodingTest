package 스택.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17952_과제는_끝나지_않아 {
    static class Task{
        int score;
        int time;
        Task(int score, int time){
            this.score = score;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Task> stack = new Stack<>();
        int result = 0;
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int flag = Integer.parseInt(st.nextToken());

            if(flag == 1){
                int score = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                stack.push(new Task(score, time));
            }

            if(!stack.isEmpty()){
                Task cur = stack.pop();
                cur.time -= 1;

                if(cur.time == 0){
                    result += cur.score;
                } else{
                    stack.push(cur);
                }
            }
        }
        System.out.println(result);
    }
}
