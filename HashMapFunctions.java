import java.util.*;

class HashMapFunctions {

    public static void main(String args[]) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("deba", 25);
        m.put("rupsha", 30);
        m.put("arnab", 40);
        m.put("rahul", 42);
        System.out.println(m);

        // size of HashMap
        System.out.println(m.size());

        // whether key is present or not
        System.out.println(m.containsKey("deba"));

        // whether value is present or not
        System.out.println(m.containsValue(30));

        // gives correspding value of a key(if key not present then gives NULL)
        System.out.println(m.get("debaaaaa"));

        // remove items
        m.remove("rahul");

        // traverse HashMap
        for (Map.Entry<String, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + "   " + e.getValue());
        }
    }
}
