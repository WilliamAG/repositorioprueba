package proyecto.unah.bd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Seccion;
import proyecto.unah.bd.repository.RepositorySeccion;

@Service
public class ServiceSeccion {
	
	@Autowired 
    RepositorySeccion repositoryseccion;
	public void crearSeccion(Seccion seccion) {
		this.repositoryseccion.save(seccion);
	}
	
	public List<Seccion> obtenerSecciones() {
		return this.repositoryseccion.findAll();
	}
	
	public Optional<Seccion> buscarSeccion(String id) {
		return this.repositoryseccion.findById(id);
	}
	
}
