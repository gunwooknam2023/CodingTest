package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P24482_깊이_우선_탐색_4 {
    static ArrayList<Integer>[] graph;
    static int[] depth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        depth = new int[N+1];

        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
            depth[i] = -1;
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i=1; i<=N; i++){
            graph[i].sort(Collections.reverseOrder());
        }

        depth[R] = 0;
        dfs(R);

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(depth[i]).append('\n');
        }
        System.out.println(sb);
    }
    static void dfs(int node){
        for(int next : graph[node]){
            if(depth[next] == -1){
                depth[next] = depth[node] + 1;
                dfs(next);
            }
        }
    }
}
