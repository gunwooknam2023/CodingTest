package 해시.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10815_숫자_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arrN[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int arrM[] = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrN);

        StringBuilder sb = new StringBuilder();
        for(int am : arrM){
            if(Arrays.binarySearch(arrN, am) >= 0){
                sb.append('1').append(' ');
            } else{
                sb.append('0').append(' ');
            }
        }
        System.out.println(sb);
    }
}
