package 해시;

import java.util.HashMap;
import java.util.Map;

public class LV2_의상 {
    public int solution(String[][] clothes) {
        Map<String, Integer> typeCountMap = new HashMap<>();
        int answer = 1;

        for(int i=0; i<clothes.length; i++){
            typeCountMap.put(clothes[i][1], typeCountMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(int count : typeCountMap.values()){
            answer *= (count + 1);
        }

        return answer-1;
    }
}
