import java.util.HashSet;

public class IntersectionOf2Arrays {

    public static void main(String[] args) {
        int a1[] = { 10, 20, 30, 40 };
        int a2[] = { 10, 20, 20, 10 };
        int countOfIntersection = 0;
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0; i < a1.length; i++) {
            hset.add(a1[i]);
        }

        for (int i = 0; i < a2.length; i++) {

            if (hset.contains(a2[i])) {
                countOfIntersection++;
                hset.remove(a2[i]);
            }

        }

        System.out.println(countOfIntersection);

    }
}