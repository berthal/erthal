package erthal.teste.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/teste")
public class TesteController {

	@GetMapping("/buscarPorCnpj")
	public ResponseEntity<String> buscarPorCnpj( String cnpj)
	{
		return ResponseEntity.ok("Tudo Ok!");
	}
}
