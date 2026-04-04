package 정렬.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P28114_팀명_정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] p = new int[3];
        int[] y = new int[3];
        String[] s = new String[3];

        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken()) % 100;
            s[i] = st.nextToken();
        }

        Arrays.sort(y);
        System.out.println("" + y[0] + y[1] + y[2]);

        for (int i=0; i<2; i++) {
            for (int j=0; j<2-i; j++) {
                if (p[j] < p[j+1]) {
                    int tempP = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = tempP;

                    String tempS = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tempS;
                }
            }
        }

        String result = "";
        for (int i=0; i<3; i++) {
            result += s[i].charAt(0);
        }

        System.out.println(result);
    }
}
