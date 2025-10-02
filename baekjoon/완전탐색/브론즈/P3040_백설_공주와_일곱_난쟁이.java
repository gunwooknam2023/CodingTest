package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3040_백설_공주와_일곱_난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        int sum = 0;

        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int fake1 = 0;
        int fake2 = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(sum - (arr[i] + arr[j]) == 100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }
        for(int i=0; i<9; i++){
            if(i != fake1 && i!= fake2){
                System.out.println(arr[i]);
            }
        }
    }
}
