package br.com.empresa.banco;

import Banco.GuardadorDeObjetos;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaGuarador {
	
		public static void main(String args[]){
			
				GuardadorDeObjetos guardador = new GuardadorDeObjetos();
				ContaCorrente cc = new ContaCorrente();
				guardador.adicionaObjeto(cc);
				ContaPoupanca cp = (ContaPoupanca) guardador.pega(0);

}}
