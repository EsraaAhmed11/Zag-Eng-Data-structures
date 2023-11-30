public class ArrayList {
    int[] array;
    int size = 0;
    int count = 0;

    public ArrayList(int n) {
        array = new int[n];
        size = n;
    }

    public ArrayList() {
        array = new int[100];
        size = 100;
    }

    public void insert(int item) {
        if (count == size)
            createArray();
        array[count] = item;
        count++;
    }

    public void printArray() {
        for (int i = 0; i < count; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }


    private void createArray() {

        size = size * 2;
        int[] newArray = new int[size];

        for (int i = 0; i < count; i++)
            newArray[i] = array[i];
        array = newArray;
    }

    public void removeIndex(int index) {

        if (index < 0 || index > count)
            throw new IllegalStateException();


        for (int i = index; i < count - 1; i++)
            array[i] = array[i + 1];
        count--;
    }

    public void removeItem(int item) {
        for (int i = item; i < count; i++)
            array[i] = array[i + 1];
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (array[i] == item)
                return i;

        return -1;
    }

    public int at(int index) {
        if (index < 0 || index > count)
            throw new IllegalStateException();
else
    return array[index];

    }

    public int max() {

        int maxNum = array[0];
        for (int i = 1; i <= count; i++)
            if (array[i] > maxNum)
                maxNum = array[i];
        return maxNum;
    }

    public int min() {

        int minNum = array[0];
        for (int i = 1; i < count; i++)
            if (array[i] < minNum)
                minNum = array[i];
        return minNum;
    }
}









