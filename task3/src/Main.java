// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList array = new ArrayList(2);

        array.insert(3);
        array.insert(5);
        array.insert(9);
        array.insert(13);
        array.removeIndex(1);
        array.removeItem(13);
        System.out.println(array.indexOf(9));
        System.out.println(array.at(2));
        System.out.println(array.max());
        System.out.println(array.min());



        array.printArray();

    }
}