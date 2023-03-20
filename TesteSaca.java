package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SacaExcepton;

public class TesteSaca {
	public static void main(String[] args) {

		Conta c = new ContaCorrente(123, 321);

		c.deposita(200.0);

		try {
			c.saca(200.0);
		} catch (SacaExcepton ex) {
			System.out.println("EX: " + ex.getMessage());
		}

		System.out.println(c.getSaldo());
	}
}
