package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26169_세_번_이내에_사과를_먹자 {
    static int[][] board = new int[5][5];
    static boolean success = false;
    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken());
        int sy = Integer.parseInt(st.nextToken());

        int apples = (board[sx][sy] == 1 ? 1 : 0);

        int prev = board[sx][sy];
        board[sx][sy] = -1;

        dfs(sx, sy, 0, apples);

        System.out.println(success ? 1 : 0);
    }
    static void dfs(int x, int y, int moves, int apples){
        if(apples >= 2){
            success = true;
            return;
        }
        if(moves == 3) return;

        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
            if(board[nx][ny] == -1) continue;

            int prev = board[nx][ny];
            int newApples = apples + (prev == 1 ? 1 : 0);

            board[nx][ny] = -1;
            dfs(nx, ny, moves+1, newApples);
            board[nx][ny] = prev;
        }
    }
}
