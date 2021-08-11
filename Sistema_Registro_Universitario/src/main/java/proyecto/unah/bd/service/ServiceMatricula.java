package proyecto.unah.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Matricula;
import proyecto.unah.bd.repository.RepositoryMatricula;

@Service

public class ServiceMatricula {
	
	@Autowired
	RepositoryMatricula repositoryMatricula;
	
	public void crearMatricula(Matricula matricula) {
		this.repositoryMatricula.save(matricula);
	}
	
	public List<Matricula> obtenerMatricula(){
		return this.repositoryMatricula.findAll();
	}
	
	public Matricula buscarMatricula(int id) {
		return this.repositoryMatricula.findById(id);
	}

}
