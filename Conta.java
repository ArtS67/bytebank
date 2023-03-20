package br.com.bytebank.banco.modelo;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int Agencia, int Numero) {
		if (Agencia < 1) {
			throw new IllegalArgumentException("Agencia da conta inválido");
		}
		if (Numero < 1) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		Conta.total++;
		System.out.println("Conta Nova Criada\n" + "Conta computada de N° " + Conta.total);
		this.agencia = Agencia;
		this.numero = Numero;
		System.out.println("Agencia: " + Agencia + "\n" + "Numero da Conta: " + Numero +  "\n");
		System.out.println("------------------------------------------------------\n");

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) throws SacaExcepton {
		if (this.saldo < valor) {
			throw new SacaExcepton("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SacaExcepton {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}

		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}
}
