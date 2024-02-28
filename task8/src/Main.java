public class Main {

    public static void main(String[] args) {


        int[] array = {1,2,3,4,5,3,2,1,5,3};


        int max = getMax(array);

        int[] freqArray = new int[max + 1];

        for (int i = 0; i < array.length; i++)

            freqArray[array[i]]++;

        for (int i = 0; i < freqArray.length; i++)

            if (freqArray[i] != 0)

                System.out.println(freqArray[i]);

    }

    private static int getMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++)

            if (array[i] > max)

                max = array[i];
        return max;
    }
}
