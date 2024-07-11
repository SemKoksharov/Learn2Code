public class FindMinElement {
    public static void main(String[] args) {
        int[] array = {52, 67, 34, 2, 9, 12, 69, 20, 3, 8, 123, 98, 1, 0};

        // Initializing the variable to store the minimum value with the first element of the array
        int minValue = array[0];
        // Initializing the variable to store the index of the minimum value
        int minIndex = 0;


        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                // Update the minimum value if the current element is smaller
                minValue = array[i];
                // Update the index of the minimum value
                minIndex = i;

            }
        }
        // Print the min value
        System.out.println("min value = " + minValue);
        // Print the index of the min value
        System.out.println("min index = " + minIndex);
    }
}
