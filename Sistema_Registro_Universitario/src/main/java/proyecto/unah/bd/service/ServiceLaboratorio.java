package proyecto.unah.bd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.unah.bd.model.Laboratorio;
import proyecto.unah.bd.repository.RepositoryLaboratorio;


@Service
public class ServiceLaboratorio {
	@Autowired 
    RepositoryLaboratorio repositorylaboratorio;
	
	public void crearLaboratorio(Laboratorio laboratorio) {
		this.repositorylaboratorio.save(laboratorio);
	}
	
	public List<Laboratorio> obtenerlaboratorios() {
		return this.repositorylaboratorio.findAll();
	}
	
	public Optional<Laboratorio> buscarlaboratorio(String id) {
		return this.repositorylaboratorio.findById(id);
	}

}
