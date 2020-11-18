package Exercicio02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int CodItem,QntItem;
		double Total;
		
		System.out.println("Menu de Opções\n 1.Cachorro Quente R$ 4.00 \n 2.X-Salada R$ 4.50 \n 3.X-Bacon R$ 5.00 \n "
							+ "4.Torrada Simples R$ 2.00 \n 5.Refrigerante R$ 1.50 ");
		System.out.println(" ");
		
		System.out.println("Digite o codigo do item: ");
		CodItem = sc.nextInt();
		
		System.out.println("Digite a quantidade deste item: ");
		QntItem = sc.nextInt();
		
		switch (CodItem) 
		{
			case 1:
				System.out.println("Você escolheu Cachorro Quente");
				Total = 4*QntItem;
				System.out.println("Total: R$ "+ Total);
			break;
			case 2:
				System.out.println("Você escolheu X-Salada");
				Total = 4.50*QntItem;
				System.out.println("Total: R$ "+ Total);
			break;
			case 3:
				System.out.println("Você escolheu X-Bacon");
				Total = 5.00*QntItem;
				System.out.println("Total: R$ "+ Total);
			break;
			case 4:
				System.out.println("Você escolheu Torrada Simples");
				Total = 2.00*QntItem;
				System.out.println("Total: R$ "+ Total);
			break;
			case 5:
				System.out.println("Você escolheu Refrigerante");
				Total = 1.50*QntItem;
				System.out.println("Total: R$ "+ Total);
		}
		sc.close();
	}

}
