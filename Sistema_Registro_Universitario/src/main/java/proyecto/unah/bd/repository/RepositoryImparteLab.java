package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.IdImparteLab;
import proyecto.unah.bd.model.ImparteLab;

public interface RepositoryImparteLab extends JpaRepository<ImparteLab,IdImparteLab>{

}
