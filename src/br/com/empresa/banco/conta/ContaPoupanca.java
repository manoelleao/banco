package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	
	
	public ContaPoupanca(String nome) {
		  this.nome = nome;
		 }
		 
		 @Override
		 public int compareTo(ContaPoupanca cp) {
		  return this.nome.compareTo(cp.getNome());
		 }


	@Override
	public void atualiza(double taxaSelic) {
				
	}


	/*@Override
	public int compareTo(ContaPoupanca o) {
		
		if (this.getNumero() < o.getNumero()) {
			return -1;
			}
			if (this.getNumero() > o.getNumero()) {
			return 1;
			}
			return 0;
	}*/
	
	/*public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
		}*/
}

