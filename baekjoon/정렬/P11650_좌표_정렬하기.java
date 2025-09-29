package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11650_좌표_정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points, (p1, p2) -> {
            if(p1[0] == p2[0]){
                return p1[1] - p2[1];
            } else{
                return p1[0] - p2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int[] p : points){
            sb.append(p[0]).append(' ').append(p[1]).append('\n');
        }
        System.out.println(sb);
    }
}
