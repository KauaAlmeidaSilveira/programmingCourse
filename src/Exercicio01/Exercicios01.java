package Exercicio01;
import java.util.Scanner;

public class Exercicios01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer x1, x2, calculo1;

		System.out.println("Exercício01");

		System.out.println("Escreva dois números: ");

		x1 = sc.nextInt();
		x2 = sc.nextInt();
		calculo1 = x1 + x2;

		System.out.println("O resultado da soma é: " + calculo1);

		System.out.println("Entrada: ");
		System.out.println(x1);
		System.out.println(x2);

		System.out.println("Saída: ");
		System.out.println(calculo1);

		System.out.println();
		System.out.println("Fim Exercício01");
		System.out.println();

		System.out.println("Exercício02");

		double raio, calculo2;
		double PI = 3.14;

		System.out.println("Digite o valor do raio: ");

		raio = sc.nextDouble();
		calculo2 = Math.pow(raio, 2.0) * PI;

		System.out.println("A area da circunferência é igual a " + calculo2);

		System.out.println("Entrada: ");
		System.out.println(raio);

		System.out.println("Saída:");
		System.out.println(calculo2);

		System.out.println();
		System.out.println("Fim do Exercício02");
		System.out.println();

		System.out.println("Exercício03");

		int a, b, c, d, calculo3;

		System.out.println("Escreva quatro numeros: ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		calculo3 = (a * b) - (c * d);

		System.out.println("A diferença entre eles é de: " + calculo3);

		System.out.println("Entrada: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println("Saída: ");
		System.out.println(calculo3);

		System.out.println();
		System.out.println("Fim do Exercício03");
		System.out.println();

		System.out.println("Exercício04");

		double NF, NH, VlrH, salario;

		System.out.println("Escreva o número do funcionário: ");

		NF = sc.nextDouble();

		System.out.println("Escreva o total de horas trabalhadas: ");

		NH = sc.nextDouble();

		System.out.println("Escreva o valor hora: ");

		VlrH = sc.nextDouble();

		salario = NH * VlrH;

		System.out.printf("O salário é de: %.2f%n", salario);
		System.out.printf("O numero do funcionario é: %.2f%n", NF);

		System.out.println();
		System.out.println("Fim do Exercício04");
		System.out.println();

		System.out.println("Exercício05");

		Double CP1, NP1, VLRP1, CP2, NP2, VLRP2, calculo5;

		System.out.println("Escreva o código da peça 1: ");
		CP1 = sc.nextDouble();

		System.out.println("Escreva o numero de peças 1: ");
		NP1 = sc.nextDouble();

		System.out.println("Escreva o valor unitário da peça 1");
		VLRP1 = sc.nextDouble();

		System.out.println("Escreva o código da peça 2: ");
		CP2 = sc.nextDouble();

		System.out.println("Escreva o numero de peças 2: ");
		NP2 = sc.nextDouble();

		System.out.println("Escreva o valor unitário da peça 2");
		VLRP2 = sc.nextDouble();

		calculo5 = (NP1 * VLRP1) + (NP2 * VLRP2);

		System.out.println("O valor total a ser pago é de: " + calculo5);

		System.out.println("Entrada: ");
		System.out.println(CP1);
		System.out.println(NP1);
		System.out.println(VLRP1);
		System.out.println(CP2);
		System.out.println(NP2);
		System.out.println(VLRP2);

		System.out.println("Saída: ");
		System.out.println(calculo5);

		System.out.println();
		System.out.println("Fim do Exercício05");
		System.out.println();

		System.out.println("Exercício06");

		double n1, n2, n3, triangulo, circulo, trapezio, quadrado, retangulo;

		System.out.println("Escreva o primeiro numero: ");
		n1 = sc.nextDouble();

		System.out.println("Escreva o segundo numero: ");
		n2 = sc.nextDouble();

		System.out.println("Escreva o terceiro numero: ");
		n3 = sc.nextDouble();

		triangulo = n1 * n3;
		circulo = Math.pow(n3, 2.0) * 3.14;
		trapezio = (n1 + n2) * n3 / 2;
		quadrado = Math.pow(n2, 2.0);
		retangulo = (n1 * n2);

		System.out.println("Entrada: ");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		System.out.println("Saída: ");
		System.out.println(triangulo);
		System.out.println(circulo);
		System.out.println(trapezio);
		System.out.println(quadrado);
		System.out.println(retangulo);

		System.out.println();
		System.out.println("Fim do Exercício06");
		System.out.println();
		sc.close();
	}
}