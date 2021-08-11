package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Carrera;

public interface RepositoryCarrera extends JpaRepository <Carrera, Integer>{
	
	public Carrera findById(int id);

}
