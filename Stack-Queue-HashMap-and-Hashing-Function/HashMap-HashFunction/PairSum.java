
import java.util.HashSet;

public class PairSum {
    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }
}
