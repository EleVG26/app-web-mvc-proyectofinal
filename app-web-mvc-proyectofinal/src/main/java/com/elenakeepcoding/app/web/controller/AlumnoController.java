package com.elenakeepcoding.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.elenakeepcoding.app.web.service.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public String index(Model modelo) {
		modelo.addAttribute("alumnos", alumnoService.listarAlumnos());
		return "alumno";
	}
	
	@GetMapping("/alumnos/new")
	public String newAlumnoForm() {
		return "crear_alumno";
	}

}
