package array.easy;

public class P_Concatenation_of_Array {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int result[] = new int[nums.length * 2];
            int length = nums.length;

            for (int i=0; i<length; i++) {
                result[i] = nums[i];
                result[i+length] = nums[i];
            }

            return result;
        }
    }
}
