package Exercicio01;
import java.util.Scanner;

public class Exercicios01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer x1, x2, calculo1;

		System.out.println("Exerc�cio01");

		System.out.println("Escreva dois n�meros: ");

		x1 = sc.nextInt();
		x2 = sc.nextInt();
		calculo1 = x1 + x2;

		System.out.println("O resultado da soma �: " + calculo1);

		System.out.println("Entrada: ");
		System.out.println(x1);
		System.out.println(x2);

		System.out.println("Sa�da: ");
		System.out.println(calculo1);

		System.out.println();
		System.out.println("Fim Exerc�cio01");
		System.out.println();

		System.out.println("Exerc�cio02");

		double raio, calculo2;
		double PI = 3.14;

		System.out.println("Digite o valor do raio: ");

		raio = sc.nextDouble();
		calculo2 = Math.pow(raio, 2.0) * PI;

		System.out.println("A area da circunfer�ncia � igual a " + calculo2);

		System.out.println("Entrada: ");
		System.out.println(raio);

		System.out.println("Sa�da:");
		System.out.println(calculo2);

		System.out.println();
		System.out.println("Fim do Exerc�cio02");
		System.out.println();

		System.out.println("Exerc�cio03");

		int a, b, c, d, calculo3;

		System.out.println("Escreva quatro numeros: ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		calculo3 = (a * b) - (c * d);

		System.out.println("A diferen�a entre eles � de: " + calculo3);

		System.out.println("Entrada: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println("Sa�da: ");
		System.out.println(calculo3);

		System.out.println();
		System.out.println("Fim do Exerc�cio03");
		System.out.println();

		System.out.println("Exerc�cio04");

		double NF, NH, VlrH, salario;

		System.out.println("Escreva o n�mero do funcion�rio: ");

		NF = sc.nextDouble();

		System.out.println("Escreva o total de horas trabalhadas: ");

		NH = sc.nextDouble();

		System.out.println("Escreva o valor hora: ");

		VlrH = sc.nextDouble();

		salario = NH * VlrH;

		System.out.printf("O sal�rio � de: %.2f%n", salario);
		System.out.printf("O numero do funcionario �: %.2f%n", NF);

		System.out.println();
		System.out.println("Fim do Exerc�cio04");
		System.out.println();

		System.out.println("Exerc�cio05");

		Double CP1, NP1, VLRP1, CP2, NP2, VLRP2, calculo5;

		System.out.println("Escreva o c�digo da pe�a 1: ");
		CP1 = sc.nextDouble();

		System.out.println("Escreva o numero de pe�as 1: ");
		NP1 = sc.nextDouble();

		System.out.println("Escreva o valor unit�rio da pe�a 1");
		VLRP1 = sc.nextDouble();

		System.out.println("Escreva o c�digo da pe�a 2: ");
		CP2 = sc.nextDouble();

		System.out.println("Escreva o numero de pe�as 2: ");
		NP2 = sc.nextDouble();

		System.out.println("Escreva o valor unit�rio da pe�a 2");
		VLRP2 = sc.nextDouble();

		calculo5 = (NP1 * VLRP1) + (NP2 * VLRP2);

		System.out.println("O valor total a ser pago � de: " + calculo5);

		System.out.println("Entrada: ");
		System.out.println(CP1);
		System.out.println(NP1);
		System.out.println(VLRP1);
		System.out.println(CP2);
		System.out.println(NP2);
		System.out.println(VLRP2);

		System.out.println("Sa�da: ");
		System.out.println(calculo5);

		System.out.println();
		System.out.println("Fim do Exerc�cio05");
		System.out.println();

		System.out.println("Exerc�cio06");

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

		System.out.println("Sa�da: ");
		System.out.println(triangulo);
		System.out.println(circulo);
		System.out.println(trapezio);
		System.out.println(quadrado);
		System.out.println(retangulo);

		System.out.println();
		System.out.println("Fim do Exerc�cio06");
		System.out.println();
		sc.close();
	}
}