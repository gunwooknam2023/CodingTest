package 반복문.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304_영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());

            sum += price * cnt;
        }

        System.out.println(x == sum ? "Yes" : "No");
    }
}
