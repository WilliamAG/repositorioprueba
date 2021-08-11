package proyecto.unah.bd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Laboratorio;

public interface RepositoryLaboratorio extends JpaRepository<Laboratorio, String>{

	public Optional <Laboratorio> findById(String Id);
	
}
