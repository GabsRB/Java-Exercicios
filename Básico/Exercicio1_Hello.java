// Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;

public class Exercicio1_Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        
        System.out.println("Hello, ");
        System.out.println(nome);
                
        scanner.close();
    }
}
