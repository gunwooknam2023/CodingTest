package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2851_슈퍼_마리오 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int prevSum = 0;
        for(int i=0; i<10; i++){
            sum += arr[i];

            if(sum >= 100){
                if(sum - 100 <= 100 - prevSum){
                    System.out.println(sum);
                } else{
                    System.out.println(prevSum);
                }
                return;
            }
            prevSum = sum;
        }
        System.out.println(sum);
    }
}
