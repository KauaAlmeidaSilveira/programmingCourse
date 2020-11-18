package Exercicio06;

import java.util.Locale;
import java.util.Scanner;

import Entidades.contaBancaria;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		contaBancaria contaBancaria;
		
		System.out.print("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Deseja efetuar um deposito inicial se sim (s) se não (n): ");
		char depositoInicial = sc.next().charAt(0);
		
		if (depositoInicial == 's') 
		{
			System.out.print("Digite o deposito inicial: ");
			double saldo = sc.nextDouble();
			contaBancaria = new contaBancaria(numeroConta,titular,saldo);
		}
		else 
		{
			contaBancaria = new contaBancaria(numeroConta,titular);
		}
		
		System.out.println();
		
		System.out.print("Dados da conta: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		
		System.out.print("Digite o valor que deseja depositar: ");
		double deposito = sc.nextDouble();
		contaBancaria.addDeposito(deposito);
		
		System.out.println("Dados da conta (Atualizados): ");
		System.out.print(contaBancaria);
		
		System.out.println();
		System.out.println();
		
		System.out.print("Digite o valor que deseja sacar: ");
		double saque = sc.nextDouble();
		contaBancaria.saque(saque);
		
		System.out.println("Dados da conta (Atualizados): ");
		System.out.print(contaBancaria);
		
		
		
		sc.close();
	}

}
