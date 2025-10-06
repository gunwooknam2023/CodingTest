package BFS.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P24446_너비_우선_탐색_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[N+1];
        int[] depth = new int[N+1];
        Arrays.fill(depth, -1);

        visited[R] = true;
        depth[R] = 0;
        q.add(R);

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int next : graph[cur]){
                if(!visited[next]){
                    visited[next] = true;
                    depth[next] = depth[cur] + 1;
                    q.add(next);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append(depth[i]).append('\n');
        }
        System.out.println(sb);
    }
}
