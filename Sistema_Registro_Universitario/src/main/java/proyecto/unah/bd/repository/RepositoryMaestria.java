package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Maestria;

public interface RepositoryMaestria extends JpaRepository <Maestria, Integer>{
	
	public Maestria findById(int id);

}
