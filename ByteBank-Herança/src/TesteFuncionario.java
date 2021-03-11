
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario Wescley = new Funcionario();
		Wescley.setNome("Wescley Alves Batista");
		Wescley.setCpf("37492434847");
		Wescley.setSalario(2590.00);
		
		System.out.println(Wescley.getNome());
		System.out.println(Wescley.getBonificacao());
	}

}
