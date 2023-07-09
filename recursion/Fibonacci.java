public class Fibonacci {
    public static int fibonacci(int n) {
        // Base case: Fibonacci of 0 is 0 and Fibonacci of 1 is 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        // Recursive case: Fibonacci of n is the sum of Fibonacci of (n-1) and Fibonacci of (n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Fibonacci sequence up to " + number + " terms:");
        for (int i = 0; i < number; i++) {
            int result = fibonacci(i);
            System.out.print(result + " ");
        }
    }
}
