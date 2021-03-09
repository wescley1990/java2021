
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 7777;
		conta.setNumero(7777);
		System.out.println(conta.getNumero());
	}
}
