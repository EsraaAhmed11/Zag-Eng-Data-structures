import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> Hashmap = new HashMap<>();

        int maxFreq = 1;

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            if (Hashmap.containsKey(k)) {
                int freq = Hashmap.get(k);
                freq++;
                Hashmap.put(k, freq);
            } else {
                Hashmap.put(k, 1);
            }

            int freq = Hashmap.get(arr[i]);
            if (freq > maxFreq) {
                maxFreq = freq;
            }
            System.out.println(maxFreq);

        }
    }
}
