package proyecto.unah.bd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Maestria;
import proyecto.unah.bd.repository.RepositoryMaestria;


@Service

public class ServiceMaestria {
	
	@Autowired 
    RepositoryMaestria repositoryMaestria;
	
	public void crearMaestria(Maestria maestria) {
		this.repositoryMaestria.save(maestria);
	}
	
	public List<Maestria> obtenerMaestrias() {
		return this.repositoryMaestria.findAll();
	}
	
	public Maestria buscarMaestria(int id) {
		return this.repositoryMaestria.findById(id);
	}

}
