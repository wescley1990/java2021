
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoWescley = new  Conta();
		contaDoWescley.saldo = 100;
		contaDoWescley.deposita(50);
		System.out.println(contaDoWescley.saldo);
	}

}
