package 심화1.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206_너의_평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0;
        double totalCredits = 0;

        for (int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }

            totalCredits += credit;

            switch (grade) {
                case "A+": totalScore += (credit * 4.5); break;
                case "A0": totalScore += (credit * 4.0); break;
                case "B+": totalScore += (credit * 3.5); break;
                case "B0": totalScore += (credit * 3.0); break;
                case "C+": totalScore += (credit * 2.5); break;
                case "C0": totalScore += (credit * 2.0); break;
                case "D+": totalScore += (credit * 1.5); break;
                case "D0": totalScore += (credit * 1.0); break;
                case "F":  totalScore += (credit * 0.0); break;
            }
        }

        System.out.printf("%6f\n", totalScore / totalCredits);
    }
}
