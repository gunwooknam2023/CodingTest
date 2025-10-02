package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P31575_도시와_비트코인 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static boolean answer = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        visited = new boolean[M][N];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(answer ? "Yes" : "No");
    }
    private static void dfs(int x, int y){
        if(x < 0 || y < 0 || x >= M || y >= N) return;
        if(map[x][y] == 0 || visited[x][y]) return;

        if(x == M -1 && y == N - 1){
            answer = true;
            return;
        }

        visited[x][y] = true;

        dfs(x, y + 1);
        dfs(x + 1, y);
    }
}
