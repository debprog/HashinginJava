import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {
        int a[] = { 10, 15, 10, 12, 13, 19, 2, 12 };

        HashMap<Integer, Integer> Frequency_Map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (Frequency_Map.containsKey(a[i])) {
                Frequency_Map.put(a[i], Frequency_Map.get(a[i]) + 1);
            }

            else {
                Frequency_Map.put(a[i], 1);

            }
        }
        for (Map.Entry<Integer, Integer> e : Frequency_Map.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
