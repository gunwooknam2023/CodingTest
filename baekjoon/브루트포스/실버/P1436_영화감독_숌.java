package 브루트포스.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436_영화감독_숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while (cnt != n) {
            num ++;

            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);
    }
}
