
public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.setTitular("Renato");
		conta.deposita(300.0);
		//
		if (conta.saca(200.0)) {

			System.out.println("\nSacou");

		} else {

			System.out.println("\nNao Sacou");

		}

	}

}
