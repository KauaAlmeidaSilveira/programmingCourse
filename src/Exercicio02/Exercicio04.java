package Exercicio02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int a,b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		
		a = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		
		b = sc.nextInt();
		
		if (a % b == 0) 
		{
			System.out.println("S�o Multiplos");
		}
		else
		{
			System.out.println("N�o s�o Multiplos");
		}
		
		sc.close();
		
	}

}
