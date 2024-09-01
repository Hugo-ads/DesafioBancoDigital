public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		Cliente hugo = new Cliente();
		venilton.setNome("Venilton");
		hugo.setNome("Hugo");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Conta cc2 = new ContaCorrente(hugo);
		Conta poupanca2 = new ContaPoupanca(hugo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc2.depositar(200);
		cc2.transferir(150, poupanca2);
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
	}
}
