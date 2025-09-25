package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class LV2_프로세스 {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        int order = 0;

        for(int i=0; i<priorities.length; i++){
            q.offer(new int[]{i, priorities[i]});
        }

        while(!q.isEmpty()){
            int cur[] = q.poll();
            boolean high = false;

            for(int[] p : q){
                if(p[1] > cur[1]){
                    high = true;
                    break;
                }
            }

            if(high){
                q.offer(cur);
            } else{
                order++;
                if(cur[0] == location){
                    return order;
                }
            }
        }

        return 0;
    }
}
