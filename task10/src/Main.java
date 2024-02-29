import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s = "esraa gvfffxfc";

        HashMap<Character, Integer> hashtable = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            int value = hashtable.containsKey(s.charAt(i)) ? hashtable.get(s.charAt(i)): 0;

            value++;

            hashtable.put(s.charAt(i), value);



        }

        System.out.println(hashtable);
        }
    }

