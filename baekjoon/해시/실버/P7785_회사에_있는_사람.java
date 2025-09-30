package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P7785_회사에_있는_사람 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            map.put(name, state);
        }

        List<String> list = new ArrayList<>();
        for(String a : map.keySet()){
            if(map.get(a).equals("enter")){
                list.add(a);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String a : list){
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}
