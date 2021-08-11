package proyecto.unah.bd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Docente;
import proyecto.unah.bd.repository.RepositoryDocente;

@Service

public class ServiceDocente {
	
	@Autowired
	RepositoryDocente repositoryDocente;
	
	public void crearDocente(Docente docente) {
		this.repositoryDocente.save(docente);
	}
	public List<Docente> obtenerTodosDocentes(){
		return this.repositoryDocente.findAll();
	}
	
	public Optional<Docente> buscarDocente(String id) {
		return this.repositoryDocente.findById(id);
	}
}