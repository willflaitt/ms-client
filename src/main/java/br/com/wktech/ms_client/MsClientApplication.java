package br.com.wktech.ms_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsClientApplication {

	private static final Logger log = LoggerFactory.getLogger(MsClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MsClientApplication.class, args);
	}

	@GetMapping("/clientes")
	public String clientes() {
		log.info("Endpoint /clientes foi chamado");
		return "Microserviço de Clientes nova versao porta 8081";
	}
}
