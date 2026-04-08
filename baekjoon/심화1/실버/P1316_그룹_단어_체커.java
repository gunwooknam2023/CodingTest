package 심화1.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316_그룹_단어_체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i=0; i<n; i++) {
            if (isGroup(br.readLine())) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isGroup(String str) {
        boolean[] b = new boolean[26];
        int prev = -1;

        for (int i=0; i<str.length(); i++) {
            int current = str.charAt(i);

            if (prev != current) {
                if (b[current - 'a']) {
                    return false;
                }
                b[current - 'a'] = true;
                prev = current;
            }
        }
        return true;
    }
}
