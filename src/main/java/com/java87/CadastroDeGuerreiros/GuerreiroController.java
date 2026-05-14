package com.java87.CadastroDeGuerreiros;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuerreiroController {

	@GetMapping("/")
	public Map<String, String> home() {
		return Map.of("message", "API Cadastro de Guerreiros em execução");
	}
}
