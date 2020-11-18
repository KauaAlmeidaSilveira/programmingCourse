package Entidades;

public class contaBancaria {

	private int numeroConta;
	private String titular;
	private double saldo;
	
	
	public contaBancaria(int numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public contaBancaria(int numeroConta, String titular) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	
	public double getNumeroConta() {
		return numeroConta;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double addDeposito(double deposito) {
		saldo += deposito;
		return saldo;
	}
	
	public double saque(double saque) {
		saldo -= saque+5;
		return saldo;
	}


	public String toString() {
		return "Conta " + numeroConta + ", Titular: "+ titular + ", Saldo: $ "+ saldo;
	}


}
