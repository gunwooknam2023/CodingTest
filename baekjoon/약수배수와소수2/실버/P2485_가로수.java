package 약수배수와소수2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2485_가로수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i=0; i<n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i=0; i<n-1; i++) {
            int dis = trees[i+1] - trees[i];
            gcd = GCD(dis, gcd);
        }

        int result = (trees[n-1] - trees[0]) / gcd + 1 - n;

        System.out.println(result);
    }
    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
