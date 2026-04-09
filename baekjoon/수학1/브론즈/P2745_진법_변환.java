package 수학1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745_진법_변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        long result = 0;
        int power = 0;

        for (int i=n.length()-1; i>=0; i--) {
            char c = n.charAt(i);
            int value;

            if (c >= '0' && c<= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }

            result += value * Math.pow(b, power++);
        }

        System.out.println(result);
    }
}
