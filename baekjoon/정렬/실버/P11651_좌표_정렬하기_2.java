package 정렬.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11651_좌표_정렬하기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            } else{
                return a[1] - b[1];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int a[] : arr){
            sb.append(a[0]).append(' ').append(a[1]).append('\n');
        }

        System.out.println(sb);
    }
}
