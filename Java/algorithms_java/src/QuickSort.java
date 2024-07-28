import java.util.*;
import java.util.stream.IntStream;

public class QuickSort {
    public static void main(String[] args) {

        int[] randomArray = Utils.newRandomArray(20, 30);
        Utils.fillThisArrayWithoutDuplicates(randomArray, 1, 100);

        System.out.println("Original random array: ");
        Utils.printArray(randomArray);

        long start = System.nanoTime();

        originalQuickFromTutorial(randomArray, 0, randomArray.length - 1);

        long finish = System.nanoTime();
        double sorted = Utils.calculateExecutionTime(start, finish);

        System.out.println("Sorted in " + sorted + " milliseconds");
        Utils.printArray(randomArray);

    }

    private static void originalQuickFromTutorial(int[] arr, int from, int to) {
        if (from < to) {
            int divideIdx = partiton(arr, from, to);
            originalQuickFromTutorial(arr, from, divideIdx - 1);
            originalQuickFromTutorial(arr, divideIdx, to);
        }
    }

    private static int partiton(int[] arr, int from, int to) {
        int rightIdx = to;
        int leftIdx = from;

        int pivot = arr[from];

        while (leftIdx <= rightIdx) {

            while (arr[leftIdx] < pivot) {
                leftIdx++;
            }
            while (arr[rightIdx] > pivot) {
                rightIdx--;
            }

            if (leftIdx <= rightIdx) {
                swap(arr, rightIdx, leftIdx);
                leftIdx++;
                rightIdx--;
            }
        }
        return leftIdx;
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static int[] functionalStyleQuick(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int pivot = arr[0];
        int[] less = Arrays.stream(arr).skip(1).filter(value -> value <= pivot).toArray();
        int[] greater = Arrays.stream(arr).skip(1).filter(value -> value > pivot).toArray();

        return IntStream.concat(Arrays.stream(functionalStyleQuick(less)), IntStream.concat(Arrays.stream(new int[]{pivot}), Arrays.stream(functionalStyleQuick(greater)))).toArray();
    }

}
