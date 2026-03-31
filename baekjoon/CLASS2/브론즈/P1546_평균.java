package CLASS2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int sum = 0;

        for (int i=0; i<n; i++) {
            int score = Integer.parseInt(st.nextToken());

            if (score > max) {
                max = score;
            }

            sum += score;
        }

        double newAverage = (sum * 100.0) / max / n;

        System.out.println(newAverage);
    }
}
