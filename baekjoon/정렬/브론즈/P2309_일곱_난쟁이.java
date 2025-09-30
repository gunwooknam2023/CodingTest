package 정렬.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309_일곱_난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrN[] = new int[9];
        for(int i=0; i<9; i++){
            arrN[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for(int a : arrN){
            sum += a;
        }

        int fake1 = 0;
        int fake2 = 0;

        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum - (arrN[i] + arrN[j]) == 100){
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
        }

        int[] result = new int[7];
        int idx = 0;
        for(int i=0; i<9; i++){
            if(i != fake1 && i != fake2){
                result[idx] = arrN[i];
                idx++;
            }
        }

        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();
        for(int a : result){
            sb.append(a).append('\n');
        }

        System.out.println(sb);
    }
}
