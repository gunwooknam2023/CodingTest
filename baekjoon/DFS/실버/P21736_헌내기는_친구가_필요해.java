package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P21736_헌내기는_친구가_필요해 {
    static char[][] campus;
    static boolean[][] visited;
    static int count = 0;
    static int N, M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        campus = new char[N][M];
        visited = new boolean[N][M];

        int startX = 0;
        int startY = 0;

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                campus[i][j] = line.charAt(j);
                if(campus[i][j] == 'I'){
                    startX = i;
                    startY = j;
                }
            }
        }

        dfs(startX, startY);

        System.out.println(count == 0 ? "TT" : count);
    }
    static void dfs(int x, int y){
        visited[x][y] = true;

        if(campus[x][y] == 'P'){
            count++;
        }

        for(int dir=0; dir<4; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
            if(visited[nx][ny]) continue;
            if(campus[nx][ny] == 'X') continue;

            dfs(nx, ny);
        }
    }
}
