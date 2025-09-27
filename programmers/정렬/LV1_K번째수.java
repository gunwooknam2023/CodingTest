package 정렬;

import java.util.Arrays;

public class LV1_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] command = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(command);
            answer[i] = command[commands[i][2]-1];
        }

        return answer;
    }
}
