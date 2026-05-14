package array_and_hashing.medium;

import java.util.*;

public class P_Group_Anagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> groups = new HashMap<>();

            for (String str : strs) {
                char[] tempStr = str.toCharArray();
                Arrays.sort(tempStr);

                String sortedString = new String(tempStr);

                if (!groups.containsKey(sortedString)) {
                    groups.put(sortedString, new ArrayList<>());
                }

                groups.get(sortedString).add(str);
            }

            return new ArrayList<>(groups.values());
        }
    }

}
