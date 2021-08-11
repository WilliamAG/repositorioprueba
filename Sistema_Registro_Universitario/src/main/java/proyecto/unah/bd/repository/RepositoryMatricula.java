package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Matricula;

public interface RepositoryMatricula extends JpaRepository <Matricula, Integer>{
	
	public Matricula findById(int id);
	
}
