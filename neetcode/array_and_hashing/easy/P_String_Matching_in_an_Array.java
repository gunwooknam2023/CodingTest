package array_and_hashing.easy;

import java.util.ArrayList;
import java.util.List;

public class P_String_Matching_in_an_Array {
    class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> list = new ArrayList<>();

            for (int i=0; i<words.length; i++) {
                for (int j=0; j<words.length; j++) {
                    if (i == j) continue;

                    if (words[j].contains(words[i])) {
                        list.add(words[i]);
                        break;
                    }
                }
            }

            return list;
        }
    }
}
