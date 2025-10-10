package 카카오_기출;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            int line = arr1[i] | arr2[i];
            String binary = String.format("%" + n + "s", Integer.toBinaryString(line));

            binary = binary.replace('1', '#');
            binary = binary.replace('0', ' ');

            answer[i] = binary;
        }
        return answer;
    }
}
