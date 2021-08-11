package proyecto.unah.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Carrera;
import proyecto.unah.bd.repository.RepositoryCarrera;

@Service

public class ServiceCarrera {
	
	@Autowired
	RepositoryCarrera repositoryCarrera;
	
	public void crearCarrera(Carrera carrera) {
		this.repositoryCarrera.save(carrera);
	}
	
	public List<Carrera> obtenerCarrera(){
		return this.repositoryCarrera.findAll();
	}
	
	public Carrera buscarCarrera(int id) {
		return this.repositoryCarrera.findById(id);
	}
	
}
