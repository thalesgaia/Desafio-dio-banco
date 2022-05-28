
public class Main {

	public static void main(String[] args) {
		Cliente thales = new Cliente();
		thales.setNome("Thales");
				
		Conta cc = new ContaCorrente(thales);
		Conta poupanca = new ContaPoupanca(thales);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}

}
