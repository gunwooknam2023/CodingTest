package CLASS2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11050_이항_계수_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 공식 n! / (k! * (n-k)!)
        int result = factorial(N) / (factorial(K) * factorial(N-K));

        System.out.println(result);
    }

    public static int factorial(int num) {
        int res = 1;

        for (int i=1; i<=num; i++) {
            res *= i;
        }

        return res;
    }
}
