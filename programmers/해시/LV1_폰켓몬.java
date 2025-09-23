package 해시;

import java.util.HashSet;

public class LV1_폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        if(hs.size() > nums.length / 2){
            return nums.length / 2;
        } else{
            return hs.size();
        }
    }
}
