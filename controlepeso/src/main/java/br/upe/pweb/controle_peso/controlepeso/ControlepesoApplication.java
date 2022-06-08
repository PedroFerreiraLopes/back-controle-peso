package br.upe.pweb.controle_peso.controlepeso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ControlepesoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlepesoApplication.class, args);
	}
}
