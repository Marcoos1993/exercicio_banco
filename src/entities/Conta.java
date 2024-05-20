package entities;


public abstract class Conta  {

	protected int numeroConta;
	protected int agencia;
	protected double saldo;
	
	protected Cliente cliente;
	
	public static final int AGENCIA_PADRAO = 1;
	public static int SEQUENCIA = 1;

	public Conta(Cliente cliente) {
		super();
		this.numeroConta = SEQUENCIA++;
		this.agencia = AGENCIA_PADRAO;
		this.cliente = cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Deposito(double valor) {
		this.saldo += valor;
	}

	public void Saque(double valor) {
		this.saldo -= valor;
	}

	public void Transferir(double valor, Conta conta) {
		this.Saque(valor);
		conta.Deposito(valor);
	}

	public void Extrato() {
		 System.out.println(cliente);
		 System.out.println("Numero de agencia: " + agencia);
		 System.out.println("Numero da conta: " +numeroConta);
		 System.out.printf("Saldo bancario: " + saldo);

	}

	@Override
	public String toString() {
		return cliente + 
				"\n Agencia: " + agencia  +  " , Numero da conta: " + numeroConta +  ", \n "
				+ "Saldo bancario: " + saldo ;
	}
	
	
	
}
