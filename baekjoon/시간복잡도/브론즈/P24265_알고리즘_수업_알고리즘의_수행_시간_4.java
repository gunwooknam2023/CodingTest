package 시간복잡도.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24265_알고리즘_수업_알고리즘의_수행_시간_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
