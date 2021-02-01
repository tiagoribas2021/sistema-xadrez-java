package Aplicacao;

import java.util.Scanner;

import Entidades.Banco;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Informe o número da Conta : ");
		int numeroConta = scan.nextInt();
		
		System.out.print("Informe o nome do Títular da Conta : ");
		String nomeTitular = scan.next();
		
		System.out.print("Possui Valor Inicial para Deposito ? : ");
		Boolean possuiDeposito = scan.nextBoolean();
		
		if (possuiDeposito) {	
			System.out.print("Informe Valor de Deposito : ");	
		 double valorDeposito = scan.nextDouble();
			
		 banco = new Banco(numeroConta, nomeTitular, valorDeposito);
		}
		else {
			banco = new Banco(numeroConta, nomeTitular);
		}
		
		System.out.println(" ");
		System.out.println("Dados Da Conta : ");
		System.out.println("Numero conta : "+banco.getNumeroDaConta()+", Nome Titular : "+banco.getNomeTitular()+", Saldo Conta $ : "+banco.getSaldo()+". ");
		
		System.out.println(" ");	
		
		System.out.print("Informe um valor de Deposito : ");
		banco.deposito(scan.nextDouble());
		
		System.out.println(" ");
		System.out.println("Dados Da Conta : ");
		System.out.println("Numero conta : "+banco.getNumeroDaConta()+", Nome Titular : "+banco.getNomeTitular()+", Saldo Conta $ : "+banco.getSaldo()+". ");
		
		System.out.println(" ");
		System.out.print("Informe um valor da Retirada : ");
		banco.retirada(scan.nextDouble());
		
		System.out.println(" ");
		System.out.println("Dados Da Conta : ");
		System.out.println("Numero conta : "+banco.getNumeroDaConta()+", Nome Titular : "+banco.getNomeTitular()+", Saldo Conta $ : "+banco.getSaldo()+". ");
		
		
		scan.close();
	}

}
