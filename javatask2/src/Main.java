import java.util.Random;
import java.util.stream.IntStream;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num = 4526;

        System.out.println("Reversed Number is" + General.reverse(num));



    int value = 500;

 System.out.println("Random value"+General.Random(value));

        int min = 1;
        int max = 100;
        System.out.println("random" + General.Random(min , max ));
      System.out.println("random-char" + General.RandomCharacter());

        Character [] array={'a', 'b', 'c'};
        printArray(array);
       // System.out.println(array[i]);


    }
    

}
