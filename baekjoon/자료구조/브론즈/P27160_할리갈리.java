package 자료구조.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P27160_할리갈리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> fruitMap = new HashMap<>();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            fruitMap.put(name, fruitMap.getOrDefault(name, 0) + count);
        }

        boolean yesNo = false;
        for(int total : fruitMap.values()) {
            if (total == 5) {
                yesNo = true;
                break;
            }
        }

        if (yesNo) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
