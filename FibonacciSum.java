public class FibonacciSum {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
    }
}