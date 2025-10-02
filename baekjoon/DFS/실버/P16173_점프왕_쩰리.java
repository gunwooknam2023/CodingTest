package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16173_점프왕_쩰리 {
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        if(found){
            System.out.println("HaruHaru");
        } else{
            System.out.println("Hing");
        }
    }

    static void dfs(int x, int y) {
        if(found) return;

        if(x < 0 || y < 0 || x >= N || y >= N || visited[x][y]) return;

        if(arr[x][y] == -1){
            found = true;
            return;
        }

        visited[x][y] = true;
        int jump = arr[x][y];

        dfs(x, y + jump);
        dfs(x + jump, y);
    }
}
