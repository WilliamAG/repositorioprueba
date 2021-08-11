package proyecto.unah.bd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Docente;

public interface RepositoryDocente extends JpaRepository<Docente,String>{
	
	public Optional<Docente> findById(String id);
}
