package 구현.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908_상수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String aStr = st.nextToken();
        String bStr = st.nextToken();

        int reverseA = Integer.parseInt(new StringBuilder(aStr).reverse().toString());
        int reverseB = Integer.parseInt(new StringBuilder(bStr).reverse().toString());

        System.out.println(reverseA > reverseB ? reverseA : reverseB);
    }
}
