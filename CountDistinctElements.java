import java.util.HashSet;

public class CountDistinctElements {

    public static void main(String args[]) {
        int a[] = { 10, 15, 10, 12, 13, 19, 2, 12 };
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }

        System.out.println("No. Distinct Elements are " + hashSet.size());
        System.out.println(hashSet);

    }

}
