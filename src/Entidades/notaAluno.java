package Entidades;

public class notaAluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	


	public double notaFinal() {
		return nota1+nota2+nota3;
	}	

	public String toString() {
		
		if (notaFinal() > 60) 
		{
			return 	"Nota Final: "+ notaFinal()+" Voc� Passou!";
		}
		else 
		{
			return  "Nota Final: "+ notaFinal()+" Voc� foi reprovado!";	
		}
			
	
	
	
	}
	
	
	
	
}
	
	