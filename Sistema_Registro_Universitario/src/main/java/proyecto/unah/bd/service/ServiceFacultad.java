package proyecto.unah.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Facultad;
import proyecto.unah.bd.repository.RepositoryFacultad;

@Service

public class ServiceFacultad {
	
	@Autowired 
    RepositoryFacultad repositoryFacultad;
	
	public void crearFacultad(Facultad facultad) {
		this.repositoryFacultad.save(facultad);
	}
	
	public List<Facultad> obtenerFacultades() {
		return this.repositoryFacultad.findAll();
	}
	
	public Facultad buscarFacultad(int id) {
		return this.repositoryFacultad.findById(id);
	}

}
