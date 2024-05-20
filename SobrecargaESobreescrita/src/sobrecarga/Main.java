package sobrecarga;

import sobrecarga.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite dois números inteiros para somar:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado1 = calc.somar(num1, num2);
        System.out.println("Resultado da soma de inteiros: " + resultado1);

        System.out.println("\nDigite três números inteiros para somar:");
        int num3 = scanner.nextInt();
        int resultado2 = calc.somar(num1, num2, num3);
        System.out.println("Resultado da soma de três inteiros: " + resultado2);

        System.out.println("\nDigite dois números decimais para somar:");
        double num4 = scanner.nextDouble();
        double num5 = scanner.nextDouble();
        double resultado3 = calc.somar(num4, num5);
        System.out.println("Resultado da soma de números decimais: " + resultado3);

        scanner.close();
    }
}
