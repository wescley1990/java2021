//Gerente é um funcionario, gerente é da classe funcionario
public class Gerente extends Funcionario { 

	private int senha;
	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	
//	public double getBonificacao() {
//		return this.salario;
//	}
		
	
	
	
	
}
