package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira Conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		System.out.println("saldo da segunda Conta: " + segundaConta.saldo);

		segundaConta.saldo += 100;
		System.out.println("saldo da segunda Conta: " + segundaConta.saldo);

		System.out.println(primeiraConta.saldo);

	}
}
