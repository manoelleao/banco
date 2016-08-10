package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
/*import Tributavel;*/
class TestaTributavel {
			
		public static void main(String[] args) {

			
			ContaCorrente cc = new ContaCorrente();
			cc.deposita(100);

			System.out.println(cc.calculaTributos());
				/*testando polimorfismo:*/

			Tributavel t = (Tributavel) cc;

			System.out.println(t.calculaTributos());
	}
}