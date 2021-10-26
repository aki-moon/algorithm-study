package algorithm.practice1.src;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int number = 0;
			while (number <= 0) {
				System.out.println("段数を入力してください");
				number = scanner.nextInt();
			}
			triangleLB(number);
			triangleLU(number);
		}
	}

	private static void triangleLB(int number) {
		System.out.println("triangleLB");
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void triangleLU(int number) {
		System.out.println("triangleLU");
		for (int i = 1; i <= number; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
