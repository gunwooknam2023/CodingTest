package array_and_hashing.medium;

import java.util.HashSet;

public class P_Longest_Consecutive_Sequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> numSet = new HashSet<>();
            int maxLength = 0;

            for (int num : nums) {
                numSet.add(num);
            }

            for (int num : numSet) {
                if (numSet.contains(num - 1)) {
                    continue;
                }

                int currentLength = 1;
                int currentNum = num;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }

            return maxLength;
        }
    }

}
