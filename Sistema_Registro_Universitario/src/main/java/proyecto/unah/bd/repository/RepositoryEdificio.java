package proyecto.unah.bd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Edificio;

public interface RepositoryEdificio extends JpaRepository <Edificio, String>{
	
	public Optional <Edificio> findById(String Id);

}
