package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11123_양_한마리_양_두마리 {
    static int H, W;
    static char[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(T>0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            board = new char[H][W];
            visited = new boolean[H][W];

            for(int i=0; i<H; i++){
                String line = br.readLine();
                for(int j=0; j<W; j++){
                    board[i][j] = line.charAt(j);
                }
            }

            int cnt = 0;
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    if(board[i][j] == '#' && !visited[i][j]){
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
            T--;
        }
        System.out.println(sb);
    }
    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int dir=0; dir<4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx >= 0 && ny >= 0 && nx < H && ny < W){
                if(board[nx][ny] == '#' && !visited[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }
    }
}
