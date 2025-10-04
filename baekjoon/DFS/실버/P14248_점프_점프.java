package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14248_점프_점프 {
    static int n;
    static int[] jump;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        jump = new int[n+1];
        visited = new boolean[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            jump[i] = Integer.parseInt(st.nextToken());
        }

        int start = Integer.parseInt(br.readLine());

        dfs(start);

        System.out.println(count);
    }
    static void dfs(int cur){
        visited[cur] = true;
        count++;

        int left = cur - jump[cur];
        int right = cur + jump[cur];

        if(left >= 1 && !visited[left]){
            dfs(left);
        }

        if(right <= n && !visited[right]){
            dfs(right);
        }
    }
}
