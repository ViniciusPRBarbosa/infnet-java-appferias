package br.edu.infnet.appferias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppferiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppferiasApplication.class, args);
	}

}
