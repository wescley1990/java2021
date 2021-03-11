
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 7777;
		conta.setNumero(7777);
		System.out.println(conta.getNumero());
		
		Cliente Wescley = new Cliente();
		Wescley.setNome("Wescley Alves Batista");
		
		conta.setTitular(Wescley);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissão("Programador");
		
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissão("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(Wescley);
		System.out.println(conta.getTitular());
		
	}
	
}
