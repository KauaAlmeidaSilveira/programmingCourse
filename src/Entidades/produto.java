package Entidades;

public class produto {

	private String nome;
	private double pre�o;
	
	
	public produto(String nome, double pre�o) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
	}
	
	public produto(double pre�o) {
		super();
		this.pre�o = pre�o;
	}




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPre�o() {
		return pre�o;
	}


	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	




}

