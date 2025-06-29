package Basic;

public class BinarySearch2 {

    // Binary Search method to search for target = 20
    public static int bSearch(int[] arr) {
        int target = 35;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {20, 25, 28, 30, 35};

        int result = bSearch(arr);

        if (result != -1) {
            System.out.println("Target 20 found at index: " + result);
        } else {
            System.out.println("Target 20 not found in the array.");
        }
    }
}
