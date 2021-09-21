package br.com.meucadastro.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meucadastro.exception.entity.Contato;
import br.com.meucadastro.persistence.repository.ContactRepository;
import br.com.meucadastro.rest.service.ContactServiceInterface;

@Service
public class ContactServiceImpl implements ContactServiceInterface{
	
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contato save(Contato contato) {
		return contactRepository.save(contato);
	}

	@Override
	public Contato edit(Contato contato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		
		contactRepository.deleteById(id);
		
	}

	@Override
	public List<Contato> findByAll() {
		return contactRepository.findAll();
		
	}

	@Override
	public Contato findById(Long id) {
		
		return contactRepository.findById(id).get();
	}
	
}
