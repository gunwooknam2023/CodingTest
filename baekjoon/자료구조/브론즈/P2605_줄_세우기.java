package 자료구조.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2605_줄_세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> line = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            int num = Integer.parseInt(st.nextToken());
            int insertIndex = line.size() - num;

            line.add(insertIndex, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int student : line) {
            sb.append(student).append(" ");
        }

        System.out.println(sb);
    }
}
