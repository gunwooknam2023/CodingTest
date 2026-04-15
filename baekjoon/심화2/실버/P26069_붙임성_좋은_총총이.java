package 심화2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P26069_붙임성_좋은_총총이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        hs.add("ChongChong");

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (hs.contains(a) || hs.contains(b)) {
                hs.add(a);
                hs.add(b);
            }
        }

        System.out.println(hs.size());
    }
}
