package 차원배열2.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int maxRow = 1;
        int maxCol = 1;

        for (int i=1; i<=9; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; j<=9; j++) {
                int n = Integer.parseInt(st.nextToken());

                if (n > max) {
                    max = n;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(max).append("\n").append(maxRow).append(" ").append(maxCol));
    }
}
