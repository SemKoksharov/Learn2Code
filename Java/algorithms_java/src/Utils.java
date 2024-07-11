import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Utils {

    private static final Random RANDOM = new Random();

    static void fillThisArrayWithoutDuplicates(int[] arr, int origin, int bound) {
        Set<Integer> temp = new HashSet<>();
        while (temp.size() < arr.length) {
            temp.add(RANDOM.nextInt(origin, bound));
        }
        int idx = 0;

        for (Integer i : temp) {
            arr[idx++] = i;
        }
    }

    static void printArray(int[] randomArray) {
        System.out.println(Arrays.toString(randomArray) + "\n");
    }

    static int[] newRandomArray(int origin, int bound) {
        return new int[RANDOM.nextInt(origin, bound)];
    }

    // for calculate precise execution time i used double and nanoseconds
    static double calculateExecutionTime(long startNanos, long finishNanos){
       return  (finishNanos - startNanos) / 1_000_000.0;
    }
}
