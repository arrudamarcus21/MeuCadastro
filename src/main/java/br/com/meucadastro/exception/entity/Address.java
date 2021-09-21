package br.com.meucadastro.exception.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;
	
	@JsonProperty("logradouro")
	private String street;
	private String cep;
	
	@JsonProperty("bairro")
	private String neighborhood;
	
	@JsonProperty("localidade")
	private String city;
	
	@JsonProperty("uf")
	private String state;
	
	
}
