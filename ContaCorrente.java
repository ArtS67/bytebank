package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int Agencia, int Numero) {
		
		super(Agencia, Numero);
	}
	
	@Override
	public void saca(double valor) throws SacaExcepton{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
