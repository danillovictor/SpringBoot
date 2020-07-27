package com.helloworld.habilidades.e.mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades_mentalidades")
public class habilidades_mentalidades 
	{
		@GetMapping
		public String hab_ment()
		{
			return "Habilidades de persistência, mentalidades de crescimento e vontade de aprender!";
		}
	}
