package proyecto.unah.bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.unah.bd.model.Departamento;

public interface RepositoryDepartamento extends JpaRepository <Departamento, Integer>{
	
	public Departamento findById(int id);

}
