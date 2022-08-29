package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return "Hello World!!!";
		
	}
	@GetMapping("/lista")
	public String listaBsm() {
		return "Lista de BSM`s:"
				+ "\n1.Proatividade"
				+ "\n2.Trabalho em equipe"
				+ "\n3.Comunicação"
				+ "\n4.Orientação aos detalhes"
				+ "\n5.Orientação ao futuro"
				+ "\n6.Responsabilidade pessoal"
				+ "\n7.Mentalidade de crescimento"
				+ "\n8.Persistência";
		
	}
	@GetMapping("/aprender")
	public String aprendizagem() {
		return "Lista de aprendizagem da semana"
				+ "\n1.POO"
				+ "\n2.MySQL"
				+ "\n3.SpringBoot";
	}
}
