package array_and_hashing.medium;

import java.util.ArrayList;
import java.util.List;

public class P_Encode_and_Decode_Strings {
    class Solution {

        public String encode(List<String> strs) {
            StringBuilder encoded = new StringBuilder();

            for (String str : strs) {
                encoded.append(str.length());
                encoded.append("#");
                encoded.append(str);
            }

            return encoded.toString();
        }

        public List<String> decode(String str) {
            List<String> result = new ArrayList<>();

            int i = 0;

            while (i < str.length()) {
                int j = i;

                while (str.charAt(j) != '#') {
                    j++;
                }

                int length = Integer.parseInt(str.substring(i, j));

                int start = j + 1;
                int end = start + length;

                result.add(str.substring(start, end));

                i = end;
            }

            return result;
        }
    }

}
