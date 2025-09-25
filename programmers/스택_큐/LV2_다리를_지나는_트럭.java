package 스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class LV2_다리를_지나는_트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        int idx = 0;

        for(int i=0; i<bridge_length; i++){
            bridge.offer(0);
        }

        while(!bridge.isEmpty()){
            time++;
            currentWeight -= bridge.poll();

            if(idx < truck_weights.length){
                if(currentWeight + truck_weights[idx] <= weight){
                    bridge.offer(truck_weights[idx]);
                    currentWeight += truck_weights[idx];
                    idx++;
                } else{
                    bridge.offer(0);
                }
            }

        }

        return time;
    }
}
