package proyecto.unah.bd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Clase;

public interface RepositoryClase extends JpaRepository<Clase, String>{
	
	public Optional <Clase> findById(String id);

}
