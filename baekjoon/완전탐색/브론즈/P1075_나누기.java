package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1075_나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int base = N - (N % 100);
        int result = 0;

        for(int i=0; i<100; i++){
            if((base + i) % F == 0){
                result = i;
                break;
            }
        }
        System.out.printf("%02d\n", result);
    }
}
