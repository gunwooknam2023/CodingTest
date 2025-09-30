package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P17219_비밀번호_찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            map.put(site, password);
        }

        List<String> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(br.readLine());
        }

        for(String a : list){
            System.out.println(map.get(a));
        }
    }
}
