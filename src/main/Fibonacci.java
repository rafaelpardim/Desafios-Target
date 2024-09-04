package main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		scanner.close();

		if (isFibonacciNumber(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
		}
	}

	public static boolean isFibonacciNumber(int n) {
		int a = 0, b = 1;
		if (n == 0 || n == 1) {
			return true;
		}

		while (b < n) {
			int temp = b;
			b = a + b;
			a = temp;
		}

		return b == n;

	}

}
