package Exercicio03;

import java.util.Locale;
import java.util.Scanner;

import Entidades.notaAluno;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		notaAluno notaAluno = new notaAluno();

		System.out.println("Digite seu nome: ");
		notaAluno.nome = sc.nextLine();

		System.out.println("Digite sua 1º Nota: ");
		notaAluno.nota1 = sc.nextDouble();

		System.out.println("Digite sua 2º Nota: ");
		notaAluno.nota2 = sc.nextDouble();

		System.out.println("Digite sua 3º Nota: ");
		notaAluno.nota3 = sc.nextDouble();

		System.out.println(notaAluno);

		sc.close();
	}

}
