package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231_분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i=1; i<N; i++){
            int sum = i;
            int temp = i;

            while(temp > 0){
                sum += temp % 10;
                temp /= 10;
            }

            if(sum == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
