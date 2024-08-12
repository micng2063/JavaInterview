// Write a Java program that illustrates merge sort.

// Merge sort is one of the most efficient sorting algorithms.
// It works on the principle of “divide and conquer”.
// It is based on the idea of breaking down a list into several sub-lists until each sub-list consists of a
// single element, and then merging those sub-lists in a manner that results in a sorted list.

public class MergeSort {
    public static void main(String[] args){
        int[] array = {70, 50, 30, 10, 20, 40, 60};

        int[] merged = mergeSort(array, 0, array.length - 1);

        for (int value : merged){
            System.out.print(value + " ");
        }
    }

    public static int[] mergeSortArray(int[] array1, int[] array2){
        int[] arraySorted = new int[array1.length + array2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length){
            if (array1[i] < array2[j]){
                arraySorted[k] = array1[i];
                k++;
                i++;
            }
            else{
                arraySorted[k] = array2[j];
                k++;
                j++;
            }
        }

        if (i == array1.length){
            while (j < array2.length){
                arraySorted[k] = array2[j];
                k++;
                j++;
            }
        }

        if (j == array2.length){
            while (i < array1.length){
                arraySorted[k] = array1[i];
                k++;
                i++;
            }
        }
        return arraySorted;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];

            return br;
        }

        int mid = (lo + hi) / 2;

        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);

        int[] merged = mergeSortArray(fh, sh);

        return merged;
    }
}
