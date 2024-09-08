package Min_Max;

public class Final {
    public static void main(String[] args) {
        // Create arrays of different data types
        Integer[] intArray = {10, 20, 30, 40, 50};
        String[] strArray = {"apple", "banana", "cherry", "date", "elderberry"};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        // Create instances of MaxMinFinder for each data type
        MaxMinFinder<Integer> intFinder = new MaxMinFinder<>();
        MaxMinFinder<String> strFinder = new MaxMinFinder<>();
        MaxMinFinder<Character> charFinder = new MaxMinFinder<>();
        MaxMinFinder<Float> floatFinder = new MaxMinFinder<>();

        // Find and print max and min values for each array
        System.out.println("Integer array:");
        System.out.println("Max: " + intFinder.findMax(intArray));
        System.out.println("Min: " + intFinder.findMin(intArray));

        System.out.println("String array:");
        System.out.println("Max: " + strFinder.findMax(strArray));
        System.out.println("Min: " + strFinder.findMin(strArray));

        System.out.println("Character array:");
        System.out.println("Max: " + charFinder.findMax(charArray));
        System.out.println("Min: " + charFinder.findMin(charArray));

        System.out.println("Float array:");
        System.out.println("Max: " + floatFinder.findMax(floatArray));
        System.out.println("Min: " + floatFinder.findMin(floatArray));
    }
}