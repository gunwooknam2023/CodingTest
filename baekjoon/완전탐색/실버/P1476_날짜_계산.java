package 완전탐색.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1476_날짜_계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;
        while(true){
            int e = year % 15 == 0 ? 15 : year % 15;
            int s = year % 28 == 0 ? 28 : year % 28;
            int m = year % 19 == 0 ? 19 : year % 19;

            if(E == e && S == s && M == m){
                System.out.println(year);
                break;
            }
            year++;
        }
    }
}
