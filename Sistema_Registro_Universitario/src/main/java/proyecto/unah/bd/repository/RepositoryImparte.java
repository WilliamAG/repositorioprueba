package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.IdImparte;
import proyecto.unah.bd.model.Imparte;

public interface RepositoryImparte extends JpaRepository<Imparte,IdImparte>{
	
}
