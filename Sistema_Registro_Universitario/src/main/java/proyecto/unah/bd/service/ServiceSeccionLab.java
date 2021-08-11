package proyecto.unah.bd.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.SeccionLab;
import proyecto.unah.bd.repository.RepositorySeccionLab;

@Service
public class ServiceSeccionLab {
	
	@Autowired
	RepositorySeccionLab repositoryseccionlab;
	public void crearSeccionLab (SeccionLab seccionlab) {
		this.repositoryseccionlab.save(seccionlab);
	}
	
	public List<SeccionLab> obtenerSeccioneslab(){
		return this.repositoryseccionlab.findAll();
	}
	

	public SeccionLab buscarSeccion(int id) {
		return this.repositoryseccionlab.findById(id);
		}
}
	
