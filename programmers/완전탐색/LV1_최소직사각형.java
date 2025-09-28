package 완전탐색;

public class LV1_최소직사각형 {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        for(int i=0; i<sizes.length; i++){
            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }

        return w * h;
    }
}
