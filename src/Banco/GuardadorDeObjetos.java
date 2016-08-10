package Banco;

public class GuardadorDeObjetos {
	
		public Object[] arrayDeObjetos = new Object[100];
		public int posicao = 0;
		
			public void adicionaObjeto(Object object) {
				this.arrayDeObjetos[this.posicao] = object;
				this.posicao++;
	}
			
			public Object pega(int indice) {
				return this.arrayDeObjetos[indice];
	}

}
