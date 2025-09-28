package 완전탐색;

import java.util.HashSet;

public class LV2_소수_찾기 {
    HashSet<Integer> primeSet = new HashSet<>();

    public int solution(String numbers) {
        char[] digits = numbers.toCharArray();
        boolean[] visited = new boolean[digits.length];

        dfs("", digits, visited);

        return primeSet.size();
    }

    public void dfs(String currentNumStr, char[] digits, boolean[] visited){
        for(int i=0; i<digits.length; i++){
            if(!visited[i]){
                visited[i] = true;

                String newNumStr = currentNumStr + digits[i];

                if(isPrime(Integer.parseInt(newNumStr))){
                    primeSet.add(Integer.parseInt(newNumStr));
                }

                dfs(newNumStr, digits, visited);

                visited[i] = false;
            }
        }
    }

    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        for(int i=2; i<=(int) Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
