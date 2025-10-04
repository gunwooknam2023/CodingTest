package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P2210_숫자판_점프 {
    static int[][] board = new int[5][5];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i, j, board[i][j] + "", 0);
            }
        }
        System.out.println(set.size());
    }
    static void dfs(int x, int y, String num, int depth){
        if(depth == 5){
            set.add(num);
            return;
        }
        for(int dir=0; dir<4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx >= 0 && ny >= 0 && nx < 5 && ny < 5){
                dfs(nx, ny, num + board[nx][ny], depth+1);
            }
        }
    }
}
