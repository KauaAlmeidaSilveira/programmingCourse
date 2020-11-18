package Entidades;

public class dadosDeFuncionario {

	public String Nome;
	public double slrGrosso;
	public double imposto;
	
	public double slrLiquido() {
		return (slrGrosso - imposto);
	}

	public void acresSalario(double porcentagem) {
		
	 slrGrosso += slrGrosso * (porcentagem/100);
	
	}

	public String toString() {
		return 	"Funcionário "+ Nome + ", " + slrLiquido();
	}






}




