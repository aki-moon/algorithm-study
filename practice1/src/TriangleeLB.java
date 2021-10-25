package algorithm.practice1.src;

import java.util.Scanner;

public class TriangleeLB {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int number = 0;
			while (number <= 0) {
				System.out.println("段数を入力してください");
				number = scanner.nextInt();
			}

			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
