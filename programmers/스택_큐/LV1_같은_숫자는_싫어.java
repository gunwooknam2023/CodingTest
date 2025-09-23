package 스택_큐;

import java.util.Stack;

public class LV1_같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for(int i=0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
