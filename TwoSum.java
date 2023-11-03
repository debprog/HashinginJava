import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int a[] = { 3, 2, 8, 15, -8 };
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            hset.add(a[i]);

        }

        int sum = 17;
        int second_num = 0;

        for (int i = 0; i < a.length; i++) {
            second_num = sum - a[i];

            if (hset.contains(second_num)) {
                System.out.println("yes the pair is " + a[i] + " & " + second_num);
                break;
            }

        }

    }
}
