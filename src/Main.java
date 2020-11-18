
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
			double pre�o = sc.nextDouble();
			vect[i] = new produto(nome, pre�o); 
			
		}
		
		double calculo = 0;
		
		for (int i = 0; i<n ; i++) {
			
			calculo = calculo + vect[i].getPre�o();
			
		}
		
		System.out.println("Media dos pre�os: "+ calculo/n);
		
		

		sc.close();
	}
}
