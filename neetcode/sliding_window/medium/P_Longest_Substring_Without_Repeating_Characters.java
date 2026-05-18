package sliding_window.medium;

import java.util.HashSet;
import java.util.Set;

public class P_Longest_Substring_Without_Repeating_Characters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> window = new HashSet<>();

            int left = 0;
            int maxLength = 0;

            for (int right=0; right<s.length(); right++) {
                char currentChar = s.charAt(right);

                while (window.contains(currentChar)) {
                    window.remove(s.charAt(left));
                    left++;
                }

                window.add(currentChar);

                maxLength = Math.max(maxLength, right - left + 1);
            }

            return maxLength;
        }
    }

}
