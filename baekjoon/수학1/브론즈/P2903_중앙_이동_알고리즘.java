package 수학1.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2903_중앙_이동_알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int point = (int)Math.pow(2, n) + 1;

        int totalPoint = point * point;

        System.out.println(totalPoint);
    }
}
