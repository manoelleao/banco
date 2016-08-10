package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TesteComparacaoConta {
	public static void main(String [] args){
		
		  Conta c1 = new ContaCorrente();
		  Conta c2 = new ContaCorrente();
		  
		  c1.setNome("Missi");
		  c2.setNome("Manoel");
		  c1.setNumero(852);
		  c2.setNumero(852);
		  
		  
		    if(c1.getNome().equals(c2.getNome()) /*&& c1.getNumero()==c2.getNumero()*/){
		     System.out.println("Nomes iguais ");
		    }else{
		     System.out.println("Nomes diferentes  ");
		    }
		    
		    if(c1.getNumero()==c2.getNumero()){
			     System.out.println("Numeros iguais ");
			    }else{
			     System.out.println("Numeros diferentes ");
			    }
	}
	}

