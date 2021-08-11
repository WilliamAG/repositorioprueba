package proyecto.unah.bd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Estudiante;
import proyecto.unah.bd.repository.RepositoryEstudiante;

@Service

public class ServiceEstudiante {
	
	@Autowired
	RepositoryEstudiante repositoryEstudiante;
	
	public void crearEstudiante(Estudiante estudiante) {
		this.repositoryEstudiante.save(estudiante);
	}
	
	public List<Estudiante> obtenerEstudiante(){
		return this.repositoryEstudiante.findAll();
	}
	
	public Optional<Estudiante> buscarEstudiante(String id) {
		return this.repositoryEstudiante.findById(id);
	}

}
