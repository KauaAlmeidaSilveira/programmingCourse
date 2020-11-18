package Entidades;

public class produto {

	private String nome;
	private double preço;
	
	
	public produto(String nome, double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}
	
	public produto(double preço) {
		super();
		this.preço = preço;
	}




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}

	




}

