package Exercicio02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int x;
		
		System.out.println("Digite um número, para saber se é par ou impar: ");
		x = sc.nextInt();
		
		if (x % 2==0) 
		{
			System.out.println("Par");
		}
		else 
		{
			System.out.println("Impar");
		}
		sc.close();
	}

}
