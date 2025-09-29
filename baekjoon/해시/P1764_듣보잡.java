package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1764_듣보잡 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> unListen = new HashSet<>();
        for(int i=0; i<N; i++){
            unListen.add(br.readLine());
        }

        Set<String> unSee = new HashSet<>();
        for(int i=0; i<M; i++){
            unSee.add(br.readLine());
        }

        unListen.retainAll(unSee);

        List<String> list = new ArrayList<>(unListen);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        for(String a : list){
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}
