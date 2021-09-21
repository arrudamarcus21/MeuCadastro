package br.com.meucadastro.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meucadastro.exception.entity.Contato;

public interface ContactRepository extends JpaRepository<Contato, Long>{
	
}
