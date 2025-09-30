package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P11652_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            long a = Long.parseLong(br.readLine());
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        long answer = Long.MAX_VALUE;
        int max = 0;
        for(long key : map.keySet()){
            int count = map.get(key);
            if(count > max){
                max = count;
                answer = key;
            } else if(count == max && key < answer){
                answer = key;
            }
        }
        System.out.println(answer);
    }
}
