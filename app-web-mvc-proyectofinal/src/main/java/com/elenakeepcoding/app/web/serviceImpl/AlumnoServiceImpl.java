package com.elenakeepcoding.app.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elenakeepcoding.app.web.entity.Alumno;
import com.elenakeepcoding.app.web.repository.AlumnoRepository;
import com.elenakeepcoding.app.web.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> listarAlumnos() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno guardarAlumno(Alumno alumno) {

		return alumnoRepository.save(alumno);
	}

	@Override
	public Alumno obtenerAlumnoPorId(Long id) {
		
		return alumnoRepository.findById(id).orElse(null);
	}

	@Override
	public Alumno actualizarAlumno(Alumno alumno) {	
		return alumnoRepository.save(alumno);
	}

	@Override
	public void eliminarAlumno(Long id) {
		alumnoRepository.deleteById(id);
	}

	

}
