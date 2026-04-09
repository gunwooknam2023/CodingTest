package 수학1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005_진법_변환_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int remainder = n % b;

            if (remainder < 10) {
                sb.append(remainder);
            } else {
                sb.append((char)(remainder - 10 + 'A'));
            }

            n /= b;
        }

        System.out.println(sb.reverse().toString());
    }
}
