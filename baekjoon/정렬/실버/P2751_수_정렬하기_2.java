package 정렬.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2751_수_정렬하기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        for(int a : A){
            sb.append(a).append('\n');
        }

        System.out.println(sb);
    }
}
