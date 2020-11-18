package Exercicio02;

import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int HrIni,HrFin,HrT;
		
		System.out.println("Digite a hora inicial do jogo: ");
		HrIni = sc.nextInt();
		
		System.out.println("Digite a hora Final do jogo: ");
		HrFin = sc.nextInt();
		
		if (HrIni<HrFin)
		{
			HrT = HrFin-HrIni;
			System.out.println("O jogo durou "+ HrT +" Horas");
		}
		else
		{
			HrT = HrIni-HrFin;
			System.out.println("O jogo durou "+ HrT +" Horas");
		}
		
		sc.close();
		

	}

}
