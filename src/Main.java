

public class Main {

	public static void main(String[] args) {
		
		Cliente titular = new Cliente();
		titular.setNome("Levisgton");
		
		Conta cc = new ContaCorrente(titular);
		cc.depositar(400);
		
		
		Conta poupanca = new ContaPoupanca(titular);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
		

}
