package array_and_hashing.easy;

public class P_Replace_Elements_With_Greatest_Element_On_Right_Side {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int max = -1;

            for (int i=arr.length-1; i>=0; i--) {
                int current = arr[i];
                arr[i] = max;
                max = Math.max(max, current);
            }

            return arr;
        }
    }
}
