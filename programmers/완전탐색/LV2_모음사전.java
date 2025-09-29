package 완전탐색;

public class LV2_모음사전 {
    class Solution {
        int count = 0;
        int answer = 0;
        String[] vowels = {"A", "E", "I", "O", "U"};

        public int solution(String word) {
            dfs("", word);
            return answer;
        }

        private void dfs(String cur, String target){
            if(cur.equals(target)){
                answer = count;
                return;
            }

            if(cur.length() == 5){
                return;
            }

            for(String v : vowels){
                count++;
                dfs(cur+v, target);
                if (answer != 0 ) return;
            }
        }
    }
}
