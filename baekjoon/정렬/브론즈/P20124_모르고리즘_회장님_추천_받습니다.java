package 정렬.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20124_모르고리즘_회장님_추천_받습니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        String winnerName = st.nextToken();
        long maxScore = Integer.parseInt(st.nextToken());

        for (int i=1; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String currentName = st.nextToken();
            long currentScore = Long.parseLong(st.nextToken());

            if (currentScore > maxScore) {
                maxScore = currentScore;
                winnerName = currentName;
            } else if (currentScore == maxScore) {
                if (currentName.compareTo(winnerName) < 0) {
                    winnerName = currentName;
                }
            }
        }

        System.out.println(winnerName);
    }
}
