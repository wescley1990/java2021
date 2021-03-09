
public class TestaBanco {

	public static void main(String[] args) {
		Cliente Wescley = new Cliente();
		Wescley.Nome = "Wescley Alves Batista";
		Wescley.CPF = "374.924.349-47";
		Wescley.Profissão = "Programador";
		Wescley.Endereço = "Rua Afonso Baldaia, 108, Jd.Cotinha, São Paulo,CEP:03888-010";
		
		Conta contaDoWescley = new Conta();
		contaDoWescley.deposita(100);
		
		//associa o cliente Wescley a conta do Wescley
		contaDoWescley.titular = Wescley;
		System.out.println(contaDoWescley.titular.Endereço);
	}

}
