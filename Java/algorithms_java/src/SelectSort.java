import java.util.Arrays;
import java.util.Random;

public class SelectSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(100)];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt( 100);
        }

        System.out.println("Original: ");
        System.out.println(Arrays.toString(array));


        for (int step = 0; step < array.length; step++) {

            int min = minIndex(array, step);
            int tmp = array[step];
            array[step] = array[min];
            array[min] = tmp;

            System.out.println(Arrays.toString(array));
            if (step == array.length - 1) {
                System.out.println("_____________________________________________________________");
            }
        }
        System.out.println("Result: ");
        System.out.println(Arrays.toString(array));
    }


    public static int minIndex(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
