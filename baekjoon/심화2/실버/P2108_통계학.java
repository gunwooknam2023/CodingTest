package 심화2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0;

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        System.out.println(Math.round(sum / n));

        Arrays.sort(arr);
        System.out.println(arr[n / 2]);

        System.out.println(getMode(arr));

        System.out.println(arr[arr.length - 1] - arr[0]);
    }
    public static int getMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int num : arr) {
            int current = map.getOrDefault(num, 0) + 1;
            map.put(num, current);
            max = Math.max(max, current);
        }

        List<Integer> list = new ArrayList<>();
        for (int num : map.keySet()) {
            if (map.get(num) == max) {
                list.add(num);
            }
        }

        Collections.sort(list);

        return list.size() > 1 ? list.get(1) : list.get(0);
    }
}
