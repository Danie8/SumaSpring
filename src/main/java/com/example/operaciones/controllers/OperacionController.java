package com.example.operaciones.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperacionController {
	
	
	@GetMapping("/sumar")
	public Float sumar(@RequestParam float a,@RequestParam float b) {
		
		return a+b;
		
	}

}
