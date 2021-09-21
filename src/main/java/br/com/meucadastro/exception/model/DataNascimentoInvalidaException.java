package br.com.meucadastro.exception.model;

public class DataNascimentoInvalidaException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DataNascimentoInvalidaException(String mensagem) {
		super(mensagem);
	}
	
	public DataNascimentoInvalidaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
