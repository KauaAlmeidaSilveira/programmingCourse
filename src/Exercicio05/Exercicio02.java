package Exercicio05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int in=0,out=0;
		
		int q = sc.nextInt(); 
		
		for (int i = 0; i < q; i++) 
		{
			
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) 
			{
				in+=1;
				
			}
			else
			{	
				out+=1;
			}
			
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
