package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P1302_베스트셀러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String cur = br.readLine();
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }

        int max = 0;
        String answer = "";
        for(String a : map.keySet()){
            int count = map.get(a);
            if(count > max){
                max = count;
                answer = a;
            } else if(count == max && a.compareTo(answer) < 0){
                answer = a;
            }
        }

        System.out.println(answer);
    }
}
