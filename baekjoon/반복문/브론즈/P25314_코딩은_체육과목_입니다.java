package 반복문.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314_코딩은_체육과목_입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n / 4;

        for (int i=0; i<result; i++) {
            System.out.print("long ");

            if (i == result-1) System.out.println("int");
        }
    }
}
