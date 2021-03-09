
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaRegina = new Conta();
		System.out.println(contaDaRegina.saldo);
		
		contaDaRegina.titular = new Cliente();
		System.out.println(contaDaRegina.titular);
		
		contaDaRegina.titular.Nome = "Regina Maria Alves Viana";
		System.out.println(contaDaRegina.titular.Nome);
	
	}
}
