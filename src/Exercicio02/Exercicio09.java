package Exercicio02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario,Imp;
		
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000)
		{
			System.out.println("Isento");
		}
		else if (salario > 2000 && salario <= 3000)
		{
			Imp = 0.08*salario;
			System.out.println("R$ "+ Imp);
		}
		else if (salario > 3000 && salario <= 4500)
		{
			Imp = 0.18*salario;
			System.out.println("R$ "+ Imp);
		}
		else if (salario > 4500 )
		{
			Imp = 0.28*salario;
			System.out.println("R$ "+ Imp);
		}
		
		
		sc.close();

	}

}
