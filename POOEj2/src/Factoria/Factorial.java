package Factoria;

public class Factorial {
    int n;
    public int factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}