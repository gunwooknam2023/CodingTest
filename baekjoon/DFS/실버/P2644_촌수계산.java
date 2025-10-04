package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2644_촌수계산 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int start, target, result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(start, 0);
        System.out.println(result);
    }
    static void dfs(int node, int depth){
        visited[node] = true;

        if(node == target){
            result = depth;
            return;
        }

        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next, depth + 1);
            }
        }
    }
}
