package BFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P5567_결혼식 {
    static int n, m;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i=0; i<m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n+1];
        dist = new int[n+1];

        bfs(1);

        int cnt = 0;
        for(int i=2; i<=n; i++){
            if(dist[i] == 1 || dist[i] == 2) cnt++;
        }
        System.out.println(cnt);
    }
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        dist[start] = 0;
        q.add(start);

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int next : graph[cur]){
                if(!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
    }
}
