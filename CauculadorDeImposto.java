package br.com.bytebank.banco.modelo;

public class CauculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public String getTotalImposto() {
		return ("O total de imposto é: " + totalImposto);
	}
}	
