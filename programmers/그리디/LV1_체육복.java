package 그리디;

public class LV1_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n+2];
        for(int i=1; i<=n; i++){
            students[i] = 1;
        }

        for(int lo : lost){
            students[lo]--;
        }

        for(int re : reserve){
            students[re]++;
        }

        for(int i=1; i<=n; i++){
            if(students[i] == 0){
                if(students[i-1] == 2){
                    students[i]++;
                    students[i-1]--;
                } else if(students[i+1] == 2){
                    students[i]++;
                    students[i+1]--;
                }
            }
        }

        for(int i=1; i<=n; i++){
            if(students[i] >= 1){
                answer++;
            }
        }

        return answer;
    }
}
