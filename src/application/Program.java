package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Banco itau = new Banco();
		
		Cliente marcos = new Cliente("Marcos" , 958507444, LocalDate.now(), "Betula negra, 450 - Sao Paulo / SP" );
		Conta c1 = new ContaCorrente(marcos);
		c1.Deposito(1000);
		itau.addConta(c1);
		
		Cliente rafaela = new Cliente("Rafaela" , 95872893, LocalDate.now(), "Barao de jaguara, 664 - Sao Paulo / SP" );
		Conta c2 = new ContaPoupanca(rafaela);
		c2.Deposito(1500);
		itau.addConta(c2);
		
		for(Conta i : itau.listContas) {
			System.out.println(i);
		}

	
	
	}

}
