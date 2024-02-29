import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println(" Please enter the input string :");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

    }

    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> hashtable = new LinkedHashMap<Character, Integer>();
        Character ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (hashtable.containsKey(ch)) {
                hashtable.put(ch, hashtable.get(ch) + 1);
            } else {
                hashtable.put(ch, 1);
            }
        }
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (hashtable.get(ch )== 1)
                System.out.println("The first non repeated character is :  " + ch);
            }
            return null;
        }
    }
