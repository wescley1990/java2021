
public class Conta {
	double saldo = 100;
	int agencia;
	int numero;
	Cliente titular;
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
