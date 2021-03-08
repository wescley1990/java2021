
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoWescley = new  Conta();
		contaDoWescley.saldo = 100;
		contaDoWescley.deposita(50);
		System.out.println(contaDoWescley.saldo);
		
		boolean conseguiuRetirar = contaDoWescley.sacar(20);
		System.out.println(contaDoWescley.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaRegina = new Conta();
		contaDaRegina.deposita(1000);
		boolean SucessoTransferencia = 
				contaDaRegina.transfere(200, contaDoWescley);
		if(SucessoTransferencia) {
		//if(contaDaRegina.transfere(200, contaDoWescley)) {
			System.out.println("transferencia com Sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaDaRegina.saldo);
		System.out.println(contaDoWescley.saldo);
		
		contaDoWescley.titular = "Wescley Alves Batista";
		System.out.println(contaDoWescley.titular);
		
	}

}
