package 완전탐색;

public class LV2_피로도 {
    class Solution {
        int answer = 0;

        public int solution(int k, int[][] dungeons) {
            boolean[] visited = new boolean[dungeons.length];
            dfs(k, dungeons, visited, 0);
            return answer;
        }

        private void dfs(int fatigue, int[][] dungeons, boolean[] visited, int count){
            answer = Math.max(answer, count);

            for(int i=0; i<dungeons.length; i++){
                int need = dungeons[i][0];
                int cost = dungeons[i][1];

                if(!visited[i] && fatigue >= need){
                    visited[i] = true;
                    dfs(fatigue-cost, dungeons, visited, count+1);
                    visited[i] = false;
                }
            }
        }
    }
}
