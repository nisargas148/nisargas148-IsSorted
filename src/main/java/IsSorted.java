public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is sorted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr) {
        // Check if the array is null or has only one element (it is trivially sorted)
        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Iterate through the array and compare each element to the next one
        for (int i = 0; i < arr.length - 1; i++) {
            // If any element is greater than the next element, it's not sorted
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        // If we didn't find any elements out of order, the array is sorted
        return true;
    }
}
