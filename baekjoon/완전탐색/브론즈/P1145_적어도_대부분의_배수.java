package 완전탐색.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1145_적어도_대부분의_배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[5];

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                for(int k=j+1; k<5; k++){
                    int num = lcm3(arr[i], arr[j], arr[k]);
                    if(result == 0 || num < result){
                        result = num;
                    }
                }
            }
        }
        System.out.println(result);
    }
    private static int gcd(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    private static int lcm3(int a, int b, int c){
        return lcm(lcm(a, b), c);
    }
}
