
import java.util.HashSet;

public class SubarrayWithGivenSum {

    static boolean isSubArrayGivenSum(int s[], int givenSum) {
        int subarray_sum = 0;
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < s.length; i++) {
            subarray_sum = subarray_sum + s[i];

            if (h.contains(subarray_sum - givenSum)) {
                return true;
            }

            else if (subarray_sum == givenSum) {
                return true;
            }
            h.add(subarray_sum);

        }
        return false;
    }

    public static void main(String[] args) {

        int arr1[] = { 5, 8, 6, 13, 3, -1 }; // has 22 as sub array sum
        int sum = 22;

        int arr2[] = { 1, 2, 4, 7 }; // has 3 as sub array sum
        int sum1 = 3;

        int arr3[] = { 1, 2, 4, 7, 9 }; // does not have 300 as sub array sum
        int sum3 = 300;

        System.out.println(isSubArrayGivenSum(arr1, sum));
        System.out.println(isSubArrayGivenSum(arr2, sum1));
        System.out.println(isSubArrayGivenSum(arr3, sum3));

    }
}
