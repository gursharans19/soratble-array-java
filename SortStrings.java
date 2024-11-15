import java.util.Arrays;

public class SortStrings {
    public static String[] sort(String[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        // Add a basic test case
        String[] input = {"banana", "apple", "cherry"};
        String[] expected = {"apple", "banana", "cherry"};
        String[] result = sort(input);

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
