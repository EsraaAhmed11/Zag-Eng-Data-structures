// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in you


  import java.util.LinkedList;
    import java.util.Scanner;


public class Main {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    LinkedList<Integer> list = new LinkedList<>();

    list.addFirst(10);
    list.addFirst(11);
    list.addLast( 15);
    list.addLast( 14);

    System.out.println(list);

}
}