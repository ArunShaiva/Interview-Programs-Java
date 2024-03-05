package array;

import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int indexToInsertAt = 2;

        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Insert the element at the specified index
        array = insertElement(array, elementToInsert, indexToInsertAt);
        
        System.out.println("Array after inserting " + elementToInsert + " at index " + indexToInsertAt + ": " + Arrays.toString(array));
    }
    
    public static int[] insertElement(int[] array, int element, int index) {
        // Create a new array with increased length to accommodate the new element
        int[] newArray = new int[array.length + 1];
        
        // Copy elements from the original array to the new array until the specified index
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        // Insert the new element at the specified index
        newArray[index] = element;
        
        // Copy the remaining elements from the original array to the new array
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        
        return newArray;
    }
}

