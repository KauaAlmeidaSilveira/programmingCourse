package Exercicio02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x;
		
		
		System.out.println("Digite um número: ");
		x = sc.nextDouble();
		
		if (x >= 0 && x <=25)
		{
			System.out.println("Este número se encontra no intervalo [0,25]");
		}
		else if (x >25 && x <=50)
		{
			System.out.println("Este número se encontra no intervalo [25,50]");
		}
		else if (x >50 && x <=75)
		{
			System.out.println("Este número se encontra no intervalo [50,75]");
		}
		else if (x > 75 && x <=100)
		{
			System.out.println("Este número se encontra no intervalo [75,100]");
		}
		else
		{
			System.out.println("Fora de intervalo");
		}
		sc.close();
		
	}

}
