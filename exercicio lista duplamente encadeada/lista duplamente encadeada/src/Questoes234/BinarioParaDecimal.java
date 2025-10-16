package Questoes234;

import java.util.Scanner;

public class BinarioParaDecimal {

    public static int binarioParaDecimalRecursivo(String binarioStr) {
        if (binarioStr == null || binarioStr.isEmpty()) {
            return 0;
        }

        String restoDaString = binarioStr.substring(0, binarioStr.length() - 1);
        char ultimoChar = binarioStr.charAt(binarioStr.length() - 1);
        int ultimoDigito = Character.getNumericValue(ultimoChar);

        return ultimoDigito + 2 * binarioParaDecimalRecursivo(restoDaString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroBinario;

        while (true) {
            System.out.print("Digite um número binário (apenas 0s e 1s) para converter para decimal: ");
            numeroBinario = scanner.nextLine();

            if (numeroBinario.matches("[01]+")) {
                break; 
            } else {
                System.out.println("Erro: Entrada inválida. Por favor, digite apenas os dígitos 0 e 1.");
            }
        }

        int valorDecimal = binarioParaDecimalRecursivo(numeroBinario);

        System.out.println("O número binário '" + numeroBinario + "' em decimal é: " + valorDecimal);

        scanner.close();
    }
}