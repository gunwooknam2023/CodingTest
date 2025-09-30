package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P1269_대칭_차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Set<Integer> setF = new HashSet<>();
        Set<Integer> setS = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++){
            setF.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<B; i++){
            setS.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> temp = new HashSet<>(setF);

        setF.removeAll(setS);
        setS.removeAll(temp);

        System.out.println(setF.size() + setS.size());
    }
}
