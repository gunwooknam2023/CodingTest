package 구현.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2588_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int res3 = a * (b % 10);
        int res4 = a * ((b % 100) / 10);
        int res5 = a * (b / 100);

        System.out.println(res3 + "\n" + res4 + "\n" + res5 + "\n" + a * b);
    }
}
