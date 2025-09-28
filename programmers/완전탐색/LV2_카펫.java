package 완전탐색;

public class LV2_카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalArea = brown + yellow;

        for(int height=3; height<=(int)Math.sqrt(totalArea); height++){
            if(totalArea % height == 0){
                int width = totalArea / height;

                if((width - 2) * (height - 2) == yellow){
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        return answer;
    }
}
