package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.SacaExcepton;
import br.com.bytebank.banco.modelo.Tributavel;

public class ContaEspecial extends Conta implements Tributavel {

	public ContaEspecial(int Agencia, int Numero) {
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
		
		return super.saldo * 0.05;
	}

}
