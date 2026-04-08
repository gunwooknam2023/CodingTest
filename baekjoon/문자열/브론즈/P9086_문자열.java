package 문자열.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9086_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<t; i++) {
            String str = br.readLine();

            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);

            sb.append(first).append(last).append("\n");
        }

        System.out.println(sb);
    }
}
