package br.com.meucadastro.exception.model;

public class CpfDuplicadoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CpfDuplicadoException(String mensagem) {
		super(mensagem);
	}
	
	public CpfDuplicadoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
