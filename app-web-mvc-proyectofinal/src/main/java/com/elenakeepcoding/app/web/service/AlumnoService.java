package com.elenakeepcoding.app.web.service;

import java.util.List;

import com.elenakeepcoding.app.web.entity.Alumno;

public interface AlumnoService {
	
	public List<Alumno> listarAlumnos();
	
	public Alumno guardarAlumno(Alumno alumno);
	
	public Alumno obtenerAlumnoPorId(Long id);
	
	public Alumno actualizarAlumno(Alumno alumno);
	
	public void eliminarAlumno(Long id);

}
