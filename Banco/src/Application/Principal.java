package Application;

import java.util.Scanner;
import Entites.Banco;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro banco");
		
		System.out.println("Digite  o número da conta: ");
		sc.nextInt();
		
		System.out.println("Digite  o nome de titular: ");
		sc.nextInt();
		
		System.out.println("Digite  o valor de depósito: ");
		sc.nextDouble();
		
		Banco conta = new Banco(int numeroConta, String nomeTitular, Double valorDeposito);
		sc.close();

	}

}
