package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1977_완전제곱수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for(int i=1; i*i<=N; i++){
            int num = i*i;
            if(num >= M){
                sum += num;
                if(!found){
                    min = num;
                    found = true;
                }
            }
        }

        if(found){
            System.out.println(sum + "\n" + min);
        } else{
            System.out.println(-1);
        }
    }
}
