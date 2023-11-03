
import java.util.*;

//add(object)
//contains()
//.iterator()
//.size()
//.remove(object)
//.isEmpty()

class AllHashFunctions {
    public static void main(String args[]) {
        HashSet<String> h = new HashSet<String>();

        h.add("deba");
        h.add("deba");
        h.add("pad");

        System.out.println(h);
        System.out.println(h.contains("debaaa"));

        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }

        h.remove("deba");
        h.remove("pad");
        System.out.println(h.size());
        System.out.println(h.isEmpty());

    }
}