package proyecto.unah.bd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Clase;
import proyecto.unah.bd.repository.RepositoryClase;

@Service

public class ServiceClase {
	
	@Autowired
	RepositoryClase repositoryClase;
	
	public void crearClase(Clase clase) {
		this.repositoryClase.save(clase);
	}
	
	public List<Clase> obtenerClase(){
		return this.repositoryClase.findAll();
	}
	
	public Optional<Clase> buscarClase(String id) {
		return this.repositoryClase.findById(id);
	}

}
