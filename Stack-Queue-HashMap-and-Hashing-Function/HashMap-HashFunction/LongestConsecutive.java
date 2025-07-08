
import java.util.HashSet;

public class LongestConsecutive {
    public static int findLongestConseqSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLength = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
