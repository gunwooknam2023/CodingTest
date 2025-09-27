package 정렬;

import java.util.Arrays;

public class LV_2_가장_큰_수 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
