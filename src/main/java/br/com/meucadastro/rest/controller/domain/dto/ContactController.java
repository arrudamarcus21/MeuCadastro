package br.com.meucadastro.rest.controller.domain.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meucadastro.exception.entity.Contato;
import br.com.meucadastro.rest.service.impl.ContactServiceImpl;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactService;
	
	@PostMapping
	private Contato save(@RequestBody Contato contact) {
		
		return contactService.save(contact);
				
	}
	
	@GetMapping("/{id}")
	private Contato findById(@PathVariable Long id) {
		
		return contactService.findById(id);
		
	}
	
	@GetMapping()
	private List<Contato> findAll() {
		
		return contactService.findByAll();
		
	}
	
	@DeleteMapping("/{id}")
	private void delete(@PathVariable Long id) {
		 contactService.delete(id);
	}
	
}
