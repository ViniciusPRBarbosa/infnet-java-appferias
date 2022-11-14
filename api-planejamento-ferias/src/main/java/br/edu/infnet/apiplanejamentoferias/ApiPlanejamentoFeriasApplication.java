package br.edu.infnet.apiplanejamentoferias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiPlanejamentoFeriasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPlanejamentoFeriasApplication.class, args);
	}

}
