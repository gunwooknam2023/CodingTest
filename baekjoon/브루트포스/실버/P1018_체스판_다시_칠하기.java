package 브루트포스.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018_체스판_다시_칠하기 {
    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new boolean[n][m];

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<m; j++) {
                board[i][j] = (str.charAt(j) == 'W');
            }
        }

        for (int i=0; i<=n-8; i++) {
            for (int j=0; j<=m-8; j++) {
                findMin(i, j);
            }
        }

        System.out.println(min);
    }

    public static void findMin(int x, int y) {
        boolean color = board[x][y];
        int cnt = 0;

        for (int i=x; i<x+8; i++) {
            for (int j=y; j<y+8; j++) {
                if (board[i][j] != color) {
                    cnt++;
                }
                color = !color;
            }
            color = !color;
        }

        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}
