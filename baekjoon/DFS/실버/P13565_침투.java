package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13565_침투 {
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int M, N;
    static boolean success = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new char[M][N];
        visited = new boolean[M][N];

        for(int i=0; i<M; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                board[i][j] = line.charAt(j);
            }
        }

        for(int j=0; j<N; j++){
            if(board[0][j] == '0' && !visited[0][j]){
                dfs(0, j);
            }
        }

        System.out.println(success ? "YES" : "NO");
    }
    static void dfs(int x, int y){
        visited[x][y] = true;

        if(x == M -1){
            success = true;
            return;
        }

        for(int dir=0; dir<4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
            if(visited[nx][ny]) continue;
            if(board[nx][ny] == '1') continue;

            dfs(nx, ny);
        }
    }
}
