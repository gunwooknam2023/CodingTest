package 스택_큐;

import java.util.Stack;

public class LV_2_주식가격 {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                int idx = stack.pop();
                answer[idx] = i-idx;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int idx = stack.pop();
            answer[idx] = prices.length - 1 - idx;
        }
        return answer;
    }
}
