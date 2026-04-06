package 차원배열1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10813_공_바꾸기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baskets = new int[n + 1];
        for (int i=1; i<=n; i++) {
            baskets[i] = i;
        }


        for (int x=1; x<=m; x++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=n; i++) {
            sb.append(baskets[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
