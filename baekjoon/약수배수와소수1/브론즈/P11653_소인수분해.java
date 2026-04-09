package 약수배수와소수1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11653_소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=2; i*i<=n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
