import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = "esraaelhaljjk";


        int[] freq = new int[26];

        for (int i = 0; i < userInput.length(); i++)
            freq[hash(userInput.charAt(i))]++;


        for (int i = 0; i < userInput.length(); i++) {
            int index = hash(userInput.charAt(i));
        }
    }


    public static int hash(int c) {

        return c -'a';
    }

        }


