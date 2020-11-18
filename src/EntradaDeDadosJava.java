
import java.util.Scanner;

public class EntradaDeDadosJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x1, x2, x3;
		int s1;
		
		
		s1 = sc.nextInt();
		sc.nextLine();
		x1 = sc.nextLine();
		x2 = sc.nextLine();
		x3 = sc.nextLine();

		System.out.println("Você digitou: ");
		System.out.println(s1);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		

		sc.close();

	}

}