public class FindUniquein3pair {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        int ans = uniqueInPairIn3(arr);
        System.out.println("Unique in array: " + ans);
    }

    public static int uniqueInPairIn3(int[] arr) {
        int ones = 0; // Initialize a variable to store the bits that appear once
        int twos = 0; // Initialize a variable to store the bits that appear twice

        for (int i = 0; i < arr.length; i++) {
            // Calculate the bits that appear once
            ones = (ones ^ arr[i]) & ~twos;

            // Calculate the bits that appear twice
            twos = (twos ^ arr[i]) & ~ones;
        }

        return ones;
    }
}
