package Exercicio03;

import java.util.Locale;
import java.util.Scanner;
import Entidades.dadosDeFuncionario;
public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		dadosDeFuncionario dadosDeFuncionario = new dadosDeFuncionario();
		
		System.out.print("Digite seu nome: ");
		dadosDeFuncionario.Nome = sc.nextLine();
		
		System.out.print("Digite seu salário grosso: ");
		dadosDeFuncionario.slrGrosso = sc.nextDouble();
		
		System.out.print("Digite sua taxa de imposto: ");
		dadosDeFuncionario.imposto = sc.nextDouble();
		
		
		System.out.println(dadosDeFuncionario);
		
		System.out.println();
		
		System.out.print("Digite a porcentagem que deseja aumentar no seu salario: "); 
		double porcentagem = sc.nextInt(); 
		dadosDeFuncionario.acresSalario(porcentagem);
		
		System.out.println();
		
		System.out.println(dadosDeFuncionario);

		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
