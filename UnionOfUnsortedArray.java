import java.util.HashSet;

public class UnionOfUnsortedArray {

    public static void main(String[] args) {

        int a1[] = { 1, 1, 2, 3, 3, 5, 6 };
        int a2[] = { 4, 7, 4, 1, 8, 8, 9 };

        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0; i < a1.length; i++) {
            hset.add(a1[i]);

        }
        for (int i = 0; i < a2.length; i++) {
            hset.add(a2[i]);

        }

        System.out.println(hset);

    }

}
