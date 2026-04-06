package 차원배열1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597_과제_안_내신_분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] students = new boolean[31];

        for (int i=0; i<28; i++) {
            int n = Integer.parseInt(br.readLine());
            students[n] = true;
        }

        for (int i=1; i<=30; i++) {
            if (!students[i]) {
                System.out.println(i);
            }
        }
    }
}
