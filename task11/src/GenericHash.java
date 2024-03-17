import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;

public class GenericHash<K,V> {

        private int count;

        private class Entry {
            private K key;
            private V value;

            public Entry(K key, V value) {
                this.value = value;
                this.key = key;
            }


        }

        private LinkedList<Entry>[] table;

        public GenericHash(int value) {
            table = (LinkedList<Entry>[]) new LinkedList[value];

        }

        private int hash(K key) {

            return key.hashCode() % table.length;
        }

        public void put(K key, V value) {
            Entry entry = new Entry (key, value);
            int index = hash(key);
            if (table[index] == null)
                table[index] = new LinkedList<>();

            for (Entry e : table[index])
                if (e.key == key) {
                    e.value = value;
                    return;
                }

            table[index].add(entry);
        }

        public V get(K key) {
            int index = hash(key);
            if (table[index] == null)
                return null;
            else {
                for (Entry e : table[index]) {
                    if (e.key == key)
                        return e.value;
                }
            }
            return null;
        }

        public void remove(K key) {
            int index = hash(key);
            if (table[index] == null)
                throw new NoSuchElementException("this key not exit");
            else {
                for (Entry e : table[index]) {
                    if (e.key == key) {

                        table[index].remove(e);
                        return;
                    }

                }

            }
            throw new NoSuchElementException("this key not exit");
        }

        public int size() {
            return count;
        }
    }



