import java.util.Arrays;

public class Main {
    // Function to find the highest pair of absolute numbers in the array
    public static void findHighestAbsolutePair(int[] tab) {
        int maxPositive = Integer.MIN_VALUE, maxNegative = Integer.MIN_VALUE;

        // Traverse the array to find the highest positive and negative numbers
        for (int num : tab) {
            if (num > 0 && num > maxPositive) {
                maxPositive = num;
            } else if (num < 0 && Math.abs(num) > maxNegative) {
                maxNegative = Math.abs(num);
            }
        }

        // Check if both positive and negative max values are found
        if (maxPositive != Integer.MIN_VALUE && maxNegative != Integer.MIN_VALUE) {
            System.out.println("The highest pair of absolute numbers in the array: " +
                    maxPositive + " and " + maxNegative);
        } else {
            System.out.println("There is no pair of absolute numbers in the array.");
        }
    }

    public static void main(String[] args) {
        int[] tab1 = {3, 2, -2, 5, -3};
        int[] tab2 = {1, 1, 2, -1, 2, -1};
        int[] tab3 = {1, 2, 3, -4};
        int[] tab4 = {1, 1};

        // Test cases
        findHighestAbsolutePair(tab1);
        findHighestAbsolutePair(tab2);
        findHighestAbsolutePair(tab3);
        findHighestAbsolutePair(tab4);
    }
}
