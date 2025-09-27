package 정렬;

import java.util.Arrays;

public class LV_2_H_Index {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int candidate = Math.min(citations[n - 1 - i], i + 1);
            h = Math.max(h, candidate);
        }

        return h;
    }
}
