package DFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P25516_거리가_k이하인_트리_노드에서_사과_수확하기 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] apple;
    static int n, k;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n];
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[p].add(c);
            graph[c].add(p);
        }

        st = new StringTokenizer(br.readLine());
        apple = new int[n];
        for(int i=0; i<n; i++){
            apple[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        System.out.println(count);
    }
    static void dfs(int node, int dist){
        if(dist > k) return;

        visited[node] = true;

        if(apple[node] == 1) count++;

        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next, dist + 1);
            }
        }
    }
}
