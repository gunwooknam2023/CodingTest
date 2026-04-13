package 약수배수와소수2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17103_골드바흐_파티션 {
    public static boolean[] isNotPrime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        makePrimeTable();

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j=2; j<=n/2; j++) {
                if (!isNotPrime[j] && !isNotPrime[n - j]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
    public static void makePrimeTable() {
        isNotPrime[0] = isNotPrime[1] == true;

        for (int i=2; i*i<=1000000; i++) {
            if (isNotPrime[i]) continue;;

            for (int j=i*i; j<=1000000; j+=i) {
                isNotPrime[j] = true;
            }
        }
    }
}
