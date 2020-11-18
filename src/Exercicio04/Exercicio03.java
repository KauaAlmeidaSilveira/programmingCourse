package Exercicio04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel,alcool,gasolina,diesel;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		
		System.out.println("Digite o numero da gasolina de preferência: \n 1.Álcool \n 2.Gasolina \n 3.Diesel \n 4.Fim");
		combustivel = sc.nextInt();
		
		
		
		while (combustivel != 4) 
		{
			
			if (combustivel == 1) 
			{
				alcool += 1;
			}
			else if (combustivel == 2) 
			{
				gasolina += 1;
			}
			else if (combustivel == 3) 
			{
				diesel += 1;
			}
			
			combustivel = sc.nextInt();
		}
	
		System.out.println("Muito obrigado! \n Ácool: "+ alcool + "\n Gasolina: "+ gasolina + "\n Diesel: "+ diesel);
		sc.close();
	}

}
