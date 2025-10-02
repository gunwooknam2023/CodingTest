package 큐.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2161_카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        int index = 1;
        while(queue.size() > 1){
            if((index % 2) == 1){
                int a = queue.poll();
                sb.append(a).append(' ');
            } else{
                int a = queue.poll();
                queue.add(a);
            }
            index++;
        }
        sb.append(queue.poll());
        System.out.println(sb);
    }
}
