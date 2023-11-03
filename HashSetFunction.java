
import java.util.*;

//add(object)
//contains()
//.iterator()
//.size()
//.remove(object)
//.isEmpty()

class HashSetFunctions {
    public static void main(String args[]) {
        HashSet<String> h = new HashSet<String>();

        // to add in HashSet
        h.add("deba");
        h.add("deba");
        h.add("pad");

        // print entire hashset
        System.out.println(h);

        // checks whether key is present in HashSet or not
        System.out.println(h.contains("debaaa"));

        // traverse in HashSet
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }

        // remove items from Hashset
        h.remove("deba");
        h.remove("pad");

        // find size of Hashset
        System.out.println(h.size());

        // check whether hashset is empty or not
        System.out.println(h.isEmpty());

    }
}