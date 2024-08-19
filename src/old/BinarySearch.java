/*
How do you implement a binary search in Java?
The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:
If the key is less than the middle element, then you now need to search only in the first half of the array.
If the key is greater than the middle element, then you need to search only in the second half of the array.
If the key is equal to the middle element in the array, then the search ends.
Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.
 */

public class BinarySearch{
    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7};

        int keyFound = binarySearch(array, 0, array.length, 7);

        System.out.print(keyFound);
    }

    public static int binarySearch(int[] array, int low, int high, int key){
        int mid = (low + high)/2;

        while (low <= high){
            if (array[mid] == key){
                return mid;
            }
            else if (array[mid] < key){
                low = mid + 1;
            }
            else if (array[mid] > key){
                high = mid - 1;
            }
            mid = (low + high)/2;
        }

        if (low > high) {
            return -1;
        }

        return -1;
    }
}