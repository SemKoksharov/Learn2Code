public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {52, 67, 34, 2, 9, 12, 69, 20, 3, 8, 123, 98, 1, 0};

        System.out.println("Original: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("Final result");
        printArray(array);
    }

    private static void bubbleSort(int[] array) {
        boolean isSorted = false;

        while (! isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i]< array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
