package 심화1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3003_킹_퀸_룩_비숍_나이트_폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<6; i++) {
            int n = Integer.parseInt(st.nextToken());

            sb.append(arr[i] - n).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
