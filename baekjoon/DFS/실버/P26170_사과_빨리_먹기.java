package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P26170_사과_빨리_먹기 {
    static int[][] board = new int[5][5];
    static boolean[][] visited = new boolean[5][5];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int minMove = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        dfs(r, c, 0, 0);

        System.out.println(minMove == Integer.MAX_VALUE ? -1 : minMove);
    }
    static void dfs(int x, int y, int apple, int dist){
        if(apple == 3){
            minMove = Math.min(minMove, dist);
        }

        visited[x][y] = true;

        for(int dir=0; dir<4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
            if(visited[nx][ny]) continue;
            if(board[nx][ny] == -1) continue;

            int nextApple = apple;
            if(board[nx][ny] == 1){
                nextApple++;
            }

            int original = board[nx][ny];
            board[nx][ny] = 0;

            dfs(nx, ny, nextApple, dist + 1);

            board[nx][ny] = original;
            visited[nx][ny] = false;
        }
    }
}
