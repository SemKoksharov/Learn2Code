import java.util.Arrays;
import java.util.Random;

public class SelectSort {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = Utils.newRandomArray(0, 60);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Original: ");
        System.out.println(Arrays.toString(array));

        long start = System.nanoTime();
        for (int step = 0; step < array.length; step++) {

            // TODO: first we need to find the min index. element
            int min = minIndex(array, step);

            // TODO: then perform the exchange (step <-> min element)
            swap(array, step, min);

            System.out.println(Arrays.toString(array));
            if (step == array.length - 1) {

                System.out.println("_____________________________________________________________");
            }
        }
        long finish = System.nanoTime();
        double exeTime = Utils.calculateExecutionTime(start, finish);

        System.out.println("Result: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Execution time: " + exeTime);
    }

    private static void swap(int[] array, int step, int min) {
        int tmp = array[step];
        array[step] = array[min];
        array[min] = tmp;
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
