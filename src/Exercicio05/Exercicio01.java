package Exercicio05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {

			if (i % 2 > 0) {

				System.out.println(i);

			}

		}

		sc.close();
	}
}
