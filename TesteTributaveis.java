package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.CauculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 120);
		ContaCorrente ccr = new ContaCorrente(222, 125);
		ContaEspecial ce = new ContaEspecial(123, 321);
		SeguroDeVida seguro = new SeguroDeVida();
		CauculadorDeImposto calc = new CauculadorDeImposto();
		
		ce.deposita(100.0);
		cc.deposita(100.0);
		
		calc.registra(seguro);
		calc.registra(cc);
		calc.registra(ccr);
		calc.registra(ce);

		
		System.out.println(calc.getTotalImposto());
	}

}
