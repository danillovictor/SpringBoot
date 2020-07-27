package com.hardskill.habilidadesTecnicas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habtec")
public class HabilidadesTecnicasController {
	
	@GetMapping
	public String hab()
	{
		return "Obter habilidades técnicas focado em back-end! \nPara no futuro eu dominar e me considerar full stack!";
	}

}
