package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11725_트리의_부모_찾기 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=N; i++){
            sb.append(parent[i]).append('\n');
        }
        System.out.println(sb);
    }
    static void dfs(int node){
        visited[node] = true;

        for(int next : graph[node]){
            if(!visited[next]){
                parent[next] = node;
                dfs(next);
            }
        }
    }
}
