
import java.util.HashSet;

public class SubarrayZero {

    static boolean isSubArrayZero(int s[]) {
        int subarray_sum = 0;
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < s.length; i++) {
            subarray_sum = subarray_sum + s[i];
            if (h.contains(subarray_sum)) {
                return true;
            } else if (subarray_sum == 0) // handle condition where entire array adds upto 0
            {
                return true;
            }
            h.add(subarray_sum);

        }
        return false;
    }

    public static void main(String[] args) {

        int arr1[] = { -3, 4, -3, -1, 0 }; // has zero sub array
        int arr2[] = { 1, 2, 3 }; // no zero sub arrays

        System.out.println(isSubArrayZero(arr1));
        System.out.println(isSubArrayZero(arr2));

    }
}
