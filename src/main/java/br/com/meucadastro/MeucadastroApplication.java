package br.com.meucadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MeucadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeucadastroApplication.class, args);
	}

}
