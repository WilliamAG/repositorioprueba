package proyecto.unah.bd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Edificio;
import proyecto.unah.bd.repository.RepositoryEdificio;

@Service

public class ServiceEdificio {
	
	@Autowired 
    RepositoryEdificio repositoryedificio;
	
	public void crearEdificio(Edificio edificio) {
		this.repositoryedificio.save(edificio);
	}
	
	public List<Edificio> obtenerEdificios() {
		return this.repositoryedificio.findAll();
	}
	
	public Optional<Edificio> buscarEdificio(String id) {
		return this.repositoryedificio.findById(id);
	}
}
