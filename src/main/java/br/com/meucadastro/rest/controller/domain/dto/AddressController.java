package br.com.meucadastro.rest.controller.domain.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meucadastro.exception.entity.Address;
import br.com.meucadastro.rest.service.external.ViaCepApi;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
	
	@Autowired
	private ViaCepApi viaCepApi;
	
	@GetMapping("/{cep}")
	public Address findAddressByCep(@PathVariable String cep) {
		
		return viaCepApi.findByCep(cep);
	}
}
