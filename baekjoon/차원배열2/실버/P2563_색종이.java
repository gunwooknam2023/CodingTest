package 차원배열2.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563_색종이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] board = new boolean[100][100];
        int totalArea = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int r=x; r<x+10; r++) {
                for (int c=y; c<y+10; c++) {
                    if (!board[r][c]) {
                        board[r][c] = true;
                        totalArea++;
                    }
                }
            }
        }

        System.out.println(totalArea);
    }
}
