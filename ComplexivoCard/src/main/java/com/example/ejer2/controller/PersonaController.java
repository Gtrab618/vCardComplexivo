package com.example.ejer2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejer2.model.Empleado;


@Controller
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private Empleado empleado;
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		model.addAttribute("IEmpleado", empleado);
		
		return "/perfil";
	}
	
	
}
