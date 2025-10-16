package Questoes234;

public class Fibonacci {

    public static int fibonacciRecursivo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci até passar de 100:");
        int i = 0;
        while (true) {
            int resultado = fibonacciRecursivo(i);
            if (resultado > 100) {
                break;
            }
            System.out.print(resultado + " ");
            i++;
        }
        System.out.println("\n");
    }
}