import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashTableChaining hashTable = new HashTableChaining();

        hashTable.put(1, "apple");
        hashTable.put(2, "banana");
        hashTable.put(3, "cherry");

        System.out.println("Value for key 2: " + hashTable.get(2));

        hashTable.remove(1);

        System.out.println("Size of the table: " + hashTable.size());
    }
}