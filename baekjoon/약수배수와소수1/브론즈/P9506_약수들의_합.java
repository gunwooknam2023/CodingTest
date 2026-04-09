package 약수배수와소수1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P9506_약수들의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i=1; i<n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i=0; i<list.size(); i++) {
                    sb.append(list.get(i));

                    if (i < list.size() - 1) {
                        sb.append(" + ");
                    }
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.").append("\n");
            }
        }
        System.out.println(sb);
    }
}
