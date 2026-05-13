package array.easy;

public class P_Number_of_Senior_Citizens {
    class Solution {
        public int countSeniors(String[] details) {
            int seniorCount = 0;

            for (String detail : details) {
                String ageText = detail.substring(11, 13);
                int age = Integer.parseInt(ageText);

                if (age > 60) {
                    seniorCount++;
                }
            }

            return seniorCount;
        }
    }
}
