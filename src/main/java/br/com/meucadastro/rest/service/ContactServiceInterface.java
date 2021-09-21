package br.com.meucadastro.rest.service;

import java.util.List;

import br.com.meucadastro.exception.entity.Contato;

public interface ContactServiceInterface {
	
	public Contato save(Contato contato);
	
	public Contato edit(Contato contato);
	
	public void delete(Long id);
	
	public List<Contato> findByAll();
	
	public Contato findById(Long id);

}
