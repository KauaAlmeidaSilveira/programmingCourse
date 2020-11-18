
import java.util.Locale;
import java.util.Scanner;

import Entidades.produto;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		produto [] vect = new produto [n];
		
		for (int i= 0; i<n ; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preço = sc.nextDouble();
			vect[i] = new produto(nome, preço); 
			
		}
		
		double calculo = 0;
		
		for (int i = 0; i<n ; i++) {
			
			calculo = calculo + vect[i].getPreço();
			
		}
		
		System.out.println("Media dos preços: "+ calculo/n);
		
		

		sc.close();
	}
}
