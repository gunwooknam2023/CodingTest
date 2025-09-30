package 정렬.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1181_단어_정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> hs = new HashSet<>();

        for(int i=0; i<N; i++){
            hs.add(br.readLine());
        }

        List<String> list = new ArrayList<>(hs);

        Collections.sort(list, (a, b) ->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            } else{
                return a.length() - b.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String a : list){
            sb.append(a).append('\n');
        }

        System.out.println(sb);
    }
}
