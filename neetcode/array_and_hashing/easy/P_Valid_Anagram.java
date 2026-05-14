package array_and_hashing.easy;

import java.util.HashMap;
import java.util.Map;

public class P_Valid_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> charCount = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);

                charCount.put(sChar, charCount.getOrDefault(sChar, 0) + 1);
                charCount.put(tChar, charCount.getOrDefault(tChar, 0) - 1);
            }

            for (int count : charCount.values()) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }
    }

}
