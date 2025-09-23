package 스택_큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LV2_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<progresses.length; i++){
            int days = 0;
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                days++;
            }
            q.offer(days);
        }

        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int standard = q.poll();
            int cnt = 1;

            while(!q.isEmpty() && q.peek() <= standard){
                q.poll();
                cnt++;
            }
            result.add(cnt);
        }

        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
