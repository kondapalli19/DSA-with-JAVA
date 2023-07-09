public class BSearch {
    public static int binarySearch(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] < target) {
                // Target is in the right half, recursively search in that half
                return binarySearchRecursive(arr, target, mid + 1, high);
            } else {
                // Target is in the left half, recursively search in that half
                return binarySearchRecursive(arr, target, low, mid - 1);
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
