
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoWescley = new  Conta();
		contaDoWescley.saldo = 100;
		contaDoWescley.deposita(50);
		System.out.println(contaDoWescley.saldo);
		
		boolean conseguiuRetirar = contaDoWescley.sacar(20);
		System.out.println(contaDoWescley.saldo);
		System.out.println(conseguiuRetirar);
	}

}
