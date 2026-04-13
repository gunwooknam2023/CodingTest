package 약수배수와소수2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4134_다음_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            long num = Long.parseLong(br.readLine());

            while (true) {
                if (isPrime(num)) {
                    System.out.println(num);
                    break;
                }
                num++;
            }
        }
    }
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (long i=3; i*i<=n; i+=2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
