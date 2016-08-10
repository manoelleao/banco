package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {
	
	public void atualiza(double taxa) {
		/*super.atualiza(taxa * 2);*/
		}
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
		}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
		}

}
