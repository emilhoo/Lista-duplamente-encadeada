package Questoes234;

import java.util.Scanner;

public class VerificadorPalindromo {

    public static void verificarSeEhPalindromo(String texto) {
        Stack pilha = new Stack();
        
        String textoFormatado = texto.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < textoFormatado.length(); i++) {
            pilha.push(textoFormatado.charAt(i));
        }

        StringBuilder textoInvertido = new StringBuilder();
        while (!pilha.isEmpty()) {
            textoInvertido.append(pilha.pop());
        }

        if (textoFormatado.equals(textoInvertido.toString())) {
            System.out.println("A string '" + texto + "' é um palíndromo.");
        } else {
            System.out.println("A string '" + texto + "' não é um palíndromo.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String entradaDoUsuario = scanner.nextLine();
        
        verificarSeEhPalindromo(entradaDoUsuario);
        
        scanner.close();
    }
}