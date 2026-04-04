package 정렬.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P5576_콘테스트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] wScore = new int[10];
        int[] kScore = new int[10];

        for(int i=0; i<10; i++) {
            wScore[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<10; i++) {
            kScore[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(wScore);
        Arrays.sort(kScore);

        int wSum = wScore[9] + wScore[8] + wScore[7];
        int kSum = kScore[9] + kScore[8] + kScore[7];

        System.out.println(wSum + " " + kSum);
    }
}
