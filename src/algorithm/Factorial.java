package algorithm;

public class Factorial {
    public static void main(String[] args) {
        int result = factorialRecursive(5);
        System.out.println("result = " + result);

        result = factorialIterative(5);
        System.out.println("result = " + result);
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
