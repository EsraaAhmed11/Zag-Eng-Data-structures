public class General {
    public static int reverse(int num) {
        int rev = 0;
        int rmd;

        while (num > 0) {
            rmd = num % 10;
            rev = (rev * 10) + rmd;
            num = num / 10;
        }

        return rev;

    }

    public static int Random(int value) {

        return (int) (Math.random() * value);
    }

    public static int Random(int min, int max) {

        return (int) (min + ((max - min) * Math.random()));
    }

   public static char RandomCharacter() {

    return 0;

       public static <T> void printArray(T [] array){
           for(int i=0;i<array.length;i++)
              System.out.println(array[i]);
       }
    }
}
