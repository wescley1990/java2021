
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(0001, -007);
					
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(0002, 0002);
		Conta conta3 = new Conta(0003, 0003);
		Conta conta4 = new Conta(0004, 0004);
		
		System.out.println(conta2.getTotal());
	}
}
