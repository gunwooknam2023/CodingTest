package 구현.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class P1157_단어_공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().toUpperCase();
        int[] count = new int[26];

        for (int i=0; i<st.length(); i++) {
            int index = st.charAt(i) - 'A';
            count[index]++;
        }

        int max = -1;
        char result = '?';

        for (int i=0; i<26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max){
                result = '?';
            }
        }

        System.out.println(result);
    }
}
