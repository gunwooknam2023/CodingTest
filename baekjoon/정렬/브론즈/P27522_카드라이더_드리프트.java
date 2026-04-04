package 정렬.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P27522_카드라이더_드리프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] times = new long[8];
        char[] teams = new char[8];
        int[] scores = {10, 8, 6, 5, 4, 3, 2, 1};

        for (int i=0; i<8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String timeStr = st.nextToken();
            teams[i] = st.nextToken().charAt(0);

            String[] time = timeStr.split(":");
            long m = Integer.parseInt(time[0]);
            long s = Integer.parseInt(time[1]);
            long ms = Integer.parseInt(time[2]);

            times[i] = (m * 60 * 1000) + (s * 1000) + ms;
        }

        for (int i=0; i<7; i++) {
            for (int j=0; j<7-i; j++) {
                if (times[j] > times[j+1]) {
                    long tempTime = times[j];
                    times[j] = times[j+1];
                    times[j+1] = tempTime;

                    char tempTeam = teams[j];
                    teams[j] = teams[j+1];
                    teams[j+1] = tempTeam;
                }
            }
        }

        int redScore = 0;
        int blueScore = 0;

        for (int i=0; i<8; i++) {
            if (teams[i] == 'B') {
                blueScore += scores[i];
            } else {
                redScore += scores[i];
            }
        }

        if (redScore > blueScore) {
            System.out.println("Red");
        } else {
            System.out.println("Blue");
        }
    }
}
