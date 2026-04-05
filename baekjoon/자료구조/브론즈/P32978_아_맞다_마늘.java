package 자료구조.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P32978_아_맞다_마늘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> ingredients = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            ingredients.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n-1; i++) {
            ingredients.remove(st.nextToken());
        }

        for (String remaining : ingredients) {
            System.out.println(remaining);
        }
    }
}
