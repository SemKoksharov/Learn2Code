import java.util.*;
import java.util.stream.IntStream;

public class QuickSort {
    public static void main(String[] args) {

        // here I tried to use 3 types of quicksort algorithms
        // 1 was from a lesson from YouTube
        // and I wrote 2 and 3
        // those that I wrote are just a test of an alternative implementation to understand the change in solution speed
        // 1st from tutorial was faster! :'(

        // the battle was lost, but not the war :D

        int[] randomArray = Utils.newRandomArray(20, 30);
        Utils.fillThisArrayWithoutDuplicates(randomArray, 1, 100);

        int[] randomArray2 = randomArray.clone();
        int[] randomArray3 = randomArray.clone();

        System.out.println("Original random array: ");
        Utils.printArray(randomArray);

        long start = System.nanoTime();

        originalQuickFromTutorial(randomArray, 0, randomArray.length - 1);

        long finish = System.nanoTime();
        double sorted = Utils.calculateExecutionTime(start, finish);

        System.out.println("Sorted in " + sorted + " milliseconds");
        Utils.printArray(randomArray);

        System.out.println("Random array clone before sorting: ");
        Utils.printArray(randomArray2);

        long start2 = System.nanoTime();

        randomArray2 = functionalStyleQuick(randomArray2);

        long finish2 = System.nanoTime();
        double sorted2 = Utils.calculateExecutionTime(start2, finish2);

        System.out.println("My functional-style quicksort: sorted in " + sorted2 + " milliseconds");
        Utils.printArray(randomArray2);


        System.out.println("Random array 3 (clone of first and second) before sorting: ");
        Utils.printArray(randomArray3);


        long start3 = System.nanoTime();

        randomArray3 = myCustomQuick(randomArray3);

        long finish3 = System.nanoTime();
        double sorted3 = Utils.calculateExecutionTime(start3, finish3);
        System.out.println("My custom quicksort: sorted in " + sorted3 + " milliseconds");
        Utils.printArray(randomArray3);
    }

    private static void originalQuickFromTutorial(int[] arr, int from, int to) {
        if (from < to) {
            int divideIdx = partiton(arr, from, to);
            originalQuickFromTutorial(arr, from, divideIdx - 1);
            originalQuickFromTutorial(arr, divideIdx, to);
        }
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


    private static int[] myCustomQuick(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[0];

        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];

            if (current <= pivot) less.add(current);
            if (current > pivot) greater.add(current);
        }

        int[] integers = less.stream().mapToInt(Integer::intValue).toArray();
        int[] integers1 = greater.stream().mapToInt(Integer::intValue).toArray();

        return IntStream.concat(Arrays.stream(myCustomQuick(integers)), IntStream.concat(Arrays.stream(new int[]{pivot}), Arrays.stream(myCustomQuick(integers1)))).toArray();
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
}
