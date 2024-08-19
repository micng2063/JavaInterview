// Write a Java program that illustrates merge sort.

// Merge sort is one of the most efficient sorting algorithms.
// It works on the principle of “divide and conquer”.
// It is based on the idea of breaking down a list into several sub-lists until each sub-list consists of a
// single element, and then merging those sub-lists in a manner that results in a sorted list.

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] array = {70, 50, 30, 10, 20, 40, 60, 110, 104};

        int[] merged = mergeSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergeSort(int[] array, int low, int high){
        if (low == high){ // if array has single element
            int[] baseArray = new int[1];
            baseArray[0] = array[low];
            return baseArray;
        }

        int mid = (low + high) / 2;

        int[] firstHalf = mergeSort(array, low, mid);
        int[] secondHalf = mergeSort(array, mid + 1, high);

        int[] mergedArray = mergeSortedArray(firstHalf, secondHalf);

        return mergedArray;
    }

    public static int[] mergeSortedArray(int[] array1, int[] array2){
        int[] arrayMerged = new int[array1.length + array2.length];

        int index1 = 0;
        int index2 = 0;
        int indexMerged = 0;

        while(index1 < array1.length && index2 < array2.length){
            if (array1[index1] < array2[index2]){
                arrayMerged[indexMerged] = array1[index1];
                index1++;
            }
            else if (array1[index1] > array2[index2]){
                arrayMerged[indexMerged] = array2[index2];
                index2++;
            }
            indexMerged++;
        }

        while(index1 < array1.length){
            arrayMerged[indexMerged] = array1[index1];
            index1++;
            indexMerged++;
        }

        while(index2 < array2.length){
            arrayMerged[indexMerged] = array2[index2];
            index2++;
            indexMerged++;
        }

        return arrayMerged;
    }

}
