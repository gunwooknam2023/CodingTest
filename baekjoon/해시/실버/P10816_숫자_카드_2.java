package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P10816_숫자_카드_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arrN[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int arrM[] = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int an : arrN){
            map.put(an, map.getOrDefault(an, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int am : arrM){
            sb.append(map.getOrDefault(am, 0)).append(' ');
        }

        System.out.println(sb);
    }
}
