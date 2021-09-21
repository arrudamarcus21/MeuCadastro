package br.com.meucadastro.rest.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.meucadastro.exception.entity.Address;

@FeignClient(name ="address", url="viacep.com.br/ws")
public interface ViaCepApi {
	
	@GetMapping("{cep}/json")
	Address findByCep(@PathVariable("cep") String cep);

}
