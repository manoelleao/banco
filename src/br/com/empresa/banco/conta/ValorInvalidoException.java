package br.com.empresa.banco.conta;

public class ValorInvalidoException extends RuntimeException{
	
	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
		
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
			}
		}

}
