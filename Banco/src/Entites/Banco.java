package Entites;

public class Banco {

	private int numeroConta;
	private String nomeTitular;
	private Double valorDeposito;

	// Construtores:
	public Banco(int numeroConta, String nomeTitular, Double valorDeposito) {
	this.numeroConta = numeroConta;
	this.nomeTitular = nomeTitular;
	this.valorDeposito = valorDeposito;
	}
	
	public Banco(int numeroConta, String nomeTitular) {
	this.numeroConta = numeroConta;
	this.nomeTitular = nomeTitular;
	}
	
	//Métodos get e Set:
	//
	public int getnumeroConta(){
		return numeroConta;
	}
	
	
	public String getnomeTitular() {
		return nomeTitular;
	}
	
	public void setnomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	publi
}
