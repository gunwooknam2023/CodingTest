package 정렬.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P28417_스케이트보드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxScore = 0;

        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            int[] scores = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            int run1 = scores[0];
            int run2 = scores[1];
            int[] tricks = Arrays.copyOfRange(scores, 2, 7);

            Arrays.sort(tricks);
            int trickSum = tricks[4] + tricks[3];

            int total = Math.max(run1, run2) + trickSum;
            maxScore = Math.max(maxScore, total);
        }
        System.out.println(maxScore);
    }
}
