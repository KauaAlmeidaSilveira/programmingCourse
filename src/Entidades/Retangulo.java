package Entidades;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double Area() {
		return altura*largura;
	}

	public double Perimetro() {
		return (altura+largura)*2;
	}

	public double Diagonal() {
		return Math.sqrt(altura*altura + largura*largura);
	}

	public String toString() {
		return 	"\n Area: " + Area() + "\n Perimetro: "+ Perimetro() +"\n Diagonal: "+ Diagonal();
	}


}



