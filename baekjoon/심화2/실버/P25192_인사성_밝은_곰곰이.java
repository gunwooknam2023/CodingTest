package 심화2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class P25192_인사성_밝은_곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<String> userLog = new HashSet<>();
        int cnt = 0;

        for (int i=0; i<n; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                userLog.clear();
            } else {
                if (!userLog.contains(str)) {
                    userLog.add(str);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
