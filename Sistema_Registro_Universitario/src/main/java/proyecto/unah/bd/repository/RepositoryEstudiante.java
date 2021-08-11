package proyecto.unah.bd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Estudiante;

public interface RepositoryEstudiante extends JpaRepository <Estudiante, String>{
	
	public Optional<Estudiante> findById(String id);

}
