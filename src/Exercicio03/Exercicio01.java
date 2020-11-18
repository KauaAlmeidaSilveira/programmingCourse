package Exercicio03;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Retangulo;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Digite a largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
