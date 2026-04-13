package 약수배수와소수2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948_베르트랑_공준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            int cnt = 0;
            for (int i=n+1; i<=2*n; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i=3; i*i<=n; i+=2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
