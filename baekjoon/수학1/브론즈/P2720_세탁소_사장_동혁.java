package 수학1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2720_세탁소_사장_동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<t; i++) {
            int money = Integer.parseInt(br.readLine());

            int quarter = money / 25;
            money %= 25;

            int dime = money / 10;
            money %= 10;

            int nickel = money / 5;
            money %= 5;

            int penny = money / 1;
            money %= 1;

            sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
        }

        System.out.println(sb);
    }
}
