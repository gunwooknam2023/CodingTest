package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P1620_나는야_포켓몬_마스터_이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for(int i=1; i<=N; i++){
            String query = br.readLine();
            map.put(query, i);
            map2.put(i, query);
        }

        for(int i=0; i<M; i++){
            String query = br.readLine();
            if(Character.isDigit(query.charAt(0))){
                int num = Integer.parseInt(query);
                System.out.println(map2.get(num));
            } else{
                System.out.println(map.get(query));
            }
        }
    }
}
