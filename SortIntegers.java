import java.util.Arrays;

// Testing

public class SortIntegers {
    public static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        // Add a basic test case
        int[] input = {3, 1, 4};
        int[] expected = {1, 3, 4};
        int[] result = sort(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Result: " + Arrays.toString(result));

        if (Arrays.equals(result, expected)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
