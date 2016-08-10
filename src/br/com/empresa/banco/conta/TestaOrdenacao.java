package br.com.empresa.banco.conta;

import java.util.*;

	public class TestaOrdenacao {
			public static void main(String[] args) {
				
		      //List<ContaPoupanca> contas = new ArrayList<>();
				List<ContaPoupanca> contas = new LinkedList<>();
				List<ContaPoupanca> nomes = new LinkedList<>();
				Random n = new Random();
				
				
				
				nomes.add(new ContaPoupanca("Francisco"));
				  nomes.add(new ContaPoupanca("Antonio"));
				  nomes.add(new ContaPoupanca("João"));
				  
				  Collections.sort(nomes);
				  
				  for(ContaPoupanca o : nomes){
				   System.out.println(o.getNome());
				  }
				
				
				/*ContaPoupanca c1 = new ContaPoupanca();
				c1.setNumero(8542);
				c1.setSaldo(1515);
				c1.setNome("Maria");
				contas.add(c1);
				
				ContaPoupanca c2 = new ContaPoupanca();
				c2.setNumero(9632);
				c2.setSaldo(5158);
				c2.setNome("João");
				contas.add(c2);
				
				ContaPoupanca c3 = new ContaPoupanca();
				c3.setNumero(4545);
				c3.setSaldo(54185);
				c3.setNome("Carlota");
				contas.add(c3);
				
				Collections.sort(contas);
				//Collections.reverse(contas); 
				//Collections.shuffle(contas);
				//Collections.rotate(contas, 0);

				for (int i = 0; i < contas.size(); i++) {
					
					System.out.println("Nome:"+contas.get(i).getNome());
					System.out.println("Saldo: " + contas.get(i).getNumero());
					 
					int resultado = n.nextInt(5000);
			        System.out.println("Aleatorio: "+resultado);
			       
					}
				 System.out.println(contas);*/
				}
				}
	
	
	
	
	
	

