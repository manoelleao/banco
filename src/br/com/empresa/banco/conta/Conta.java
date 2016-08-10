package br.com.empresa.banco.conta;

public abstract class Conta {
	protected double saldo;
	protected int numero;
	protected String nome;
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + this.saldo+"\n";
		}
	
	
	public boolean equals(Object obj) {
	Conta outraConta = (Conta) obj;
	return this.numero == outraConta.numero;
	}
	
	public abstract void atualiza(double taxaSelic);
	
	public void deposita(double valor) {
		
			if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" +
			" um valor negativo");
			} else {
			this.saldo += valor - 0.10;
			}
			
			}
		
	
		public void saca(double valor) {
		this.saldo -= valor;
		}
		
		public double getSaldo() {
		return this.saldo;
		}
		

}
