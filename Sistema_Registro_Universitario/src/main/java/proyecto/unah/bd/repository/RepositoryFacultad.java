package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Facultad;

public interface RepositoryFacultad extends JpaRepository<Facultad, Integer>{
	
	public Facultad findById(int id);

}
